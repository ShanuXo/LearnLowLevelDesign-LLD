package StructuralDesignPattern.CompositeDesignPattern.SecondSolutionCompositeDesign;

public class Expression implements ArithmeticExpression{

      ArithmeticExpression leftArithmeticExpression;
      ArithmeticExpression rightArithmeticExpression;
      Operation operation;

      public Expression(ArithmeticExpression lefArithmeticExpression, ArithmeticExpression rigArithmeticExpression,Operation operation)
      {
        this.leftArithmeticExpression = leftArithmeticExpression;
        this.rightArithmeticExpression = rightArithmeticExpression;
        this.operation = operation;
      }

    @Override
    public int evaluate()
      {
        int value=0;
        switch(operation)
        {
            case ADD:
                value = leftArithmeticExpression.evaluate() + rightArithmeticExpression.evaluate();
                break;
            case SUBTRACT:
                value= rightArithmeticExpression.evaluate() + rightArithmeticExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftArithmeticExpression.evaluate() * rightArithmeticExpression.evaluate();
                break;
            case DIVIDE:
                value = leftArithmeticExpression.evaluate() / rightArithmeticExpression.evaluate();
                break;        
        }
        System.out.println("Expression Value is : " + value);
        return value;
    }
}
