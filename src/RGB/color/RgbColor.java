package RGB.color;

import java.util.*;

public class RgbColor extends GeneralColor  {

    // object from class ListValueOfRgb
    private static ListValueOfRgb listValueOfRgb;
    // variables
    private final int red;
    private final int green;
    private final int blue;

//constructor
    private RgbColor(int red, int green , int blue) {
        this.red= red;
        this.green= green;
        this.blue= blue;
    }
    //instance
    private static RgbColor instance=null;
// get instance function
    public static RgbColor getInstance(String color, int red , int green, int blue) {
        // Checks if the numbers are within the rang
        if(listValueOfRgb.setValidValue(red,green,blue)) {
            // Check if the list does not have a similar value
            if (!listValueOfRgb.containsValue(red,green,blue)){
                // If more than one object is created at the same time
                synchronized (RgbColor.class) {
                    // Check if the list does not have a similar value
                    if (!listValueOfRgb.containsValue(red,green,blue)) {
                        // Creates a new object and stores it in the instance
                        instance= new RgbColor(red, green, blue);
                        // Add the object that was built in the hashmap with its name
                        listValueOfRgb.getColorRgb().put(color,listValueOfRgb.ConvertString(red,green,blue));
                    }
                }
            }else {
                // if the list does have a similar value the app this statement
                System.out.println("A copy of it has been returned because it exists");
            }
        }
        //In any case, return instance
        return instance;
    }
// Getter
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

// inherited from Class GeneralColor
    @Override
public void printColor(Map.Entry<String, GeneralColor> entry){
    System.out.println(entry.getValue());
}


    @Override
    public String toString(){return "the value of Color RGB : "+this.red + " , " + this.green + " , " + this.blue;}

}