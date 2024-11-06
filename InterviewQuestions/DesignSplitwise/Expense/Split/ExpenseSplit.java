package InterviewQuestions.DesignSplitwise;

import InterviewQuestions.DesignSplitwiseview.Expense.Split.Split;
import java.util.List;

public interface ExpenseSplit {
    public void validateSplitRequest(List<Split> splitList,double totalAmount);
}
