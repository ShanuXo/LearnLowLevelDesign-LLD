package InterpreterPatterDesign;

import InterpreterPatterDesign.AbstractInterface.AbstractExpression;
import InterpreterPatterDesign.AbstractInterface.MultiplyNonTerminalExpression;
import InterpreterPatterDesign.AbstractInterface.NumberTerminalExpression;
import InterpreterPatterDesign.AbstractInterface.SumNonTerminalExpression;
import InterpreterPatterDesign.ContextProvider.Context;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.add("a", 2);
        context.add("b", 4);
        context.add("c", 8);
        context.add("d", 16);

        // (a*b)
        AbstractExpression expression1 = new MultiplyNonTerminalExpression(new NumberTerminalExpression(("a")),
                new NumberTerminalExpression("b"));

        AbstractExpression expression2 = new SumNonTerminalExpression(
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"),
                        new NumberTerminalExpression("d")));

        System.out.println(expression1.interpret(context));
        System.out.println(expression2.interpret(context));
    }
}
