package InterpreterPatterDesign.ContextProvider;

import java.util.HashMap;

public class Context {
    HashMap<String, Integer> contextMap = new HashMap<>();

    public void add(String strVaribale, int value) {
        contextMap.put(strVaribale, value);
    }

    public int get(String strVariable) {
        return contextMap.get(strVariable);
    }
}
