package StructuralDesignPattern.CompositeDesignPattern.SecondSolutionCompositeDesign;

public class Main {
    public static void main(String[] args) {
        {
            //2 * (1+7)

            ArithmeticExpression two=new Number(2);
            ArithmeticExpression one=new Number(1);
            ArithmeticExpression seven=new Number(7);
            ArithmeticExpression addArithmeticExpression = new Expression(one,seven,Operation.ADD);
            ArithmeticExpression parithmeticExpression = new Expression(two,addArithmeticExpression,Operation.MULTIPLY);
            System.out.println(parithmeticExpression.evaluate());

        }
    }
}
