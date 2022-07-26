package matys.tests.utils;

import java.util.HashMap;

public class ScenarioContext {
    private final HashMap<String,Object> context = new HashMap<>(10);
    public Object get(String key) {return  context.get(key);}
    public String getAsString(String key) { return (String) context.get(key);}

    public String getWithDefault(String key){
        if(context.containsKey(key))
            return  getAsString(key);
        return " ";
    }

    public void addElement (String key, Object value) { context.put(key,value);}
}
