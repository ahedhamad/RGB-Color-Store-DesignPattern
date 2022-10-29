package RGB.color;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListValueOfRgb {
    private static final Map<String,String> colorRgb = new HashMap<>();

    public static Map<String, String> getColorRgb() {
        return colorRgb;
    }

    // This function takes the three colors and checks them if they are within the range(0-255) and returns true or false
    public static boolean setValidValue(int red, int green, int blue) {
        if ( red <= 255 && red >=0 && green <= 255 && green >= 0 && blue<= 255 && blue >= 0){
            return true;
        } else{
            System.out.println("Please represent the value ranges from 0-255");
            return false;
        }
    }

    // This function creates a HashSet, adds the three colors to it, and returns the hashset.
    public static HashSet listOfValue(int red, int green, int blue){
        HashSet<Integer> colors=new HashSet<>();
        colors.add(red);
        colors.add(green);
        colors.add(blue);
        return colors;
    }

   // This function converts all lists to strings using toString() function.
    public static String ConvertString(int red, int green, int blue){
       // String listString = listOfValue(red,green,blue).toString();
        return listOfValue(red,green,blue).toString();
    }

    // This function uses function ConvertString() to convert the three colors and then uses keyWord (containsValue) to check if this string exists in the map (colorRgb) then returned true or false.
    public static boolean containsValue(int red, int green, int blue){
        if(colorRgb.containsValue(ConvertString(red,green,blue)))
            return true;
        else
            return false;
    }

}
