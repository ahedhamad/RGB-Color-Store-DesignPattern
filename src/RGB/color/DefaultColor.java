package RGB.color;

import java.util.Map;
import java.util.HashMap;

public class DefaultColor extends GeneralColor{

    private String name;
//Constructor
private DefaultColor(String name)
{
    this.name=name;
}
//instance
    private static DefaultColor instance=null;

    private static final Map<String,String> defaultColor = new HashMap<>();
//get Instance
    public static DefaultColor getInstance(String name){
        if (!defaultColor.containsKey(name)){
            synchronized (DefaultColor.class){
                if (!defaultColor.containsKey(name))
                {
                    instance = new DefaultColor(name);
                    defaultColor.put(name,null);
                }
            }
        }
        return instance;
    }

    public static Map<String, String> getDefaultColor() {
        return defaultColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void printColor(Map.Entry<String, GeneralColor> entry){
        System.out.println(entry.getKey());
    }
    @Override
    public String toString(){return "the value of Default Color  : " + null;}
}
