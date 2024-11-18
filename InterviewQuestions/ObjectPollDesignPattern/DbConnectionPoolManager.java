package InterviewQuestions.ObjectPollDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DbConnectionPoolManager {
    private List<DbConnection> freeConnectionsInPool = new ArrayList<>();
    private List<DbConnection> connectionsCurrentlyInUse=new ArrayList<>();

    private static final int Initial_PoolSize=3;
    private static final int Max_PoolSize =6;

    private static DbConnectionPoolManager dbConnectionPoolManagerInstance =null;

    private DbConnectionPoolManager()
    {
        for(int i=0;i<Initial_PoolSize;i++)
        {
            freeConnectionsInPool.add(new DbConnection());
        }
    }

    public static DbConnectionPoolManager getInstance()
    {
        if(dbConnectionPoolManagerInstance==null)
        {
            synchronized(DbConnectionPoolManager.class)
            {
                if(dbConnectionPoolManagerInstance==null)
                {
                    dbConnectionPoolManagerInstance = new DbConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManagerInstance;
    }

    public synchronized DbConnection getDbConnection()
    {
        if(freeConnectionsInPool.isEmpty() && freeConnectionsInPool.size() < Max_PoolSize)
        {
            freeConnectionsInPool.add(new DbConnection());
        }else if(freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size()>=Max_PoolSize)
        {
            connectionsCurrentlyInUse.add(new DbConnection());
            return null;
        }

        DbConnection dbConnection = freeConnectionsInPool.remove(freeConnectionsInPool.size()-1);
        connectionsCurrentlyInUse.add(dbConnection);
        return dbConnection;
    }

    public synchronized void releaseDbConnection(DbConnection dbConnection)
    {
        if(dbConnection == null)
        {
            connectionsCurrentlyInUse.remove(dbConnection);
            freeConnectionsInPool.add(dbConnection);
        }
    }
}
