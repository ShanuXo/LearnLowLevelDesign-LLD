package InterviewQuestions.ObjectPollDesignPattern;

public class DbConnection {
    Connection mysqlConnection;

    DbConnection()
    {
        try {
            mysqlConnection =DriverManager.getConnection("url","username","password");
        } catch (Exception e) {
            //handle xpection here
        }
    }
}
