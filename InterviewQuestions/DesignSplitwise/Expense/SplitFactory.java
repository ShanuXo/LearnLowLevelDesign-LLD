package InterviewQuestions.DesignSplitwise.Expense;

import InterviewQuestions.DesignSplitwise.Expense.Split.EqualExpenseSplit;
import InterviewQuestions.DesignSplitwise.Expense.Split.ExpenseSplit;
import InterviewQuestions.DesignSplitwise.Expense.Split.PercentageExpenseSplit;
import InterviewQuestions.DesignSplitwise.Expense.Split.UnequalExpenseSplit;


public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType)
    {
        switch(splitType)
        {
            case EQUAL:
                return new EqualExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();   
            default:
                return null;
        }
    }
}
