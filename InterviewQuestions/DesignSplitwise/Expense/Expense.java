package InterviewQuestions.DesignSplitwise.Expense;

import InterviewQuestions.DesignSplitwise.Expense.ExpenseSplitType;
import InterviewQuestions.DesignSplitwise.Expense.Split.Split;
import InterviewQuestions.DesignSplitwise.Expense.Split.User.User;

import java.util.ArrayList;
import java.util.List;

public class Expense {
    String expenseId;
    String description;
    double  expenseAmount;
    User paidByUser;
    ExpenseSplitType splitType;//equal or unequal or percentage
    List<Split> splitDetails=new ArrayList<>();

    public Expense(String expenseId,String description,double  expenseAmount,User paidByUser,ExpenseSplitType splitType,List<Split> splitDetails=new ArrayList<>())
    {
        this.expenseId=expenseId;
        this.description=description;
        this.expenseAmount=expenseAmount;
        this.paidByUser=paidByUser;
        this.splitType=splitType;
        this.splitDetails.addAll(splitDetails);
    }

}
