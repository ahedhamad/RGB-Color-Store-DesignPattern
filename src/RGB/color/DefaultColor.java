package RGB.color;

import java.util.Map;
import java.util.HashMap;

public class DefaultColor extends GeneralColor{

    private final String name;
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
        // Check if the Map(defaultColor) does not have a similar name of color
        if (!defaultColor.containsKey(name)){
            // If more than one object is created at the same time
            synchronized (DefaultColor.class){
                // Check if the Map(defaultColor) does not have a similar name of color
                if (!defaultColor.containsKey(name))
                {
                    // Creates a new object and stores it in the instance
                    instance = new DefaultColor(name);
                    // Add the object that was built in the hashmap with its name, it is given a value of null because it has no RGB
                    defaultColor.put(name,null);
                }
            }
        }
        //In any case, return instance
        return instance;
    }

    public static Map<String, String> getDefaultColor() {
        return defaultColor;
    }

//it prints the key (name Color) from map
    @Override
    public void printColor(Map.Entry<String, GeneralColor> entry){
        System.out.println(entry.getKey());
    }
    @Override
    public String toString(){return "the value of Default Color  : " + null;}
}
