package InterviewQuestions.DesignSplitwise.Expense.Split;

import InterviewQuestions.DesignSplitwise.ExpenseSplit;
import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {

@Override
public void validateSplitRequest(List<Split> splitList,double totalAmount)
{
    double equalAmount=totalAmount/splitList.size();

    for(Split split : splitList)
    {
        if(split.getAmountOwe() != equalAmount)
        {
            //throw exception
        }
    }
}
}