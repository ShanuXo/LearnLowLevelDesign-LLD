package InterviewQuestions.ObjectPollDesignPattern;

public class Client {
    public static void main(String[] args) {
        DbConnectionPoolManager poolManager=DbConnectionPoolManager.getInstance();

        DbConnection connection1=poolManager.getConnection();//first resources
        DbConnection connection2=poolManager.getConnection();
        DbConnection connection3=poolManager.getConnection();
        DbConnection connection4=poolManager.getConnection();
        DbConnection connection5=poolManager.getConnection();
        DbConnection connection6=poolManager.getConnection();
        poolManager.getDbConnection();
        poolManager.releaseDbConnection(connection6);
    }
}
