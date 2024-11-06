package InterviewQuestions.DesignSplitwise.User;

import InterviewQuestions.DesignSplitwise.UserExpenseBalanceSheet;

public class User {
    String userId;
    String userName;
    UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String id,String userName)
    {
        this.userId=id;
        this.userName=userName;
        this.userExpenseBalanceSheet=new UserExpenseBalanceSheet();
    }
  
    public String getUserId()
    {
        return userId;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet()
    {
        return userExpenseBalanceSheet;
    }
}
