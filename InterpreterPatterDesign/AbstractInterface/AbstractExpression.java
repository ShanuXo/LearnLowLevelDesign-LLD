package InterpreterPatterDesign.AbstractInterface;

import InterpreterPatterDesign.ContextProvider.Context;

public interface AbstractExpression {

    int interpret(Context context);
}
