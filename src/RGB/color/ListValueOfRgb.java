package RGB.color;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListValueOfRgb {
    private static final Map<String,String> colorRgb = new HashMap<>();

    public static Map<String, String> getColorRgb() {
        return colorRgb;
    }

    public static boolean setValidValue(int red, int green, int blue) {
        if ( red <= 255 && red >=0 && green <= 255 && green >= 0 && blue<= 255 && blue >= 0){
            return true;
        } else{
            System.out.println("Please represent the value ranges from 0-255");
            return false;
        }
    }
    public static HashSet listOfValue(int red, int green, int blue){
        HashSet<Integer> colors=new HashSet<>();
        colors.add(red);
        colors.add(green);
        colors.add(blue);
        return colors;
    }

    public static String ConvertString(int red, int green, int blue){
       // String listString = listOfValue(red,green,blue).toString();
        return listOfValue(red,green,blue).toString();
    }
    public static boolean containsValue(int red, int green, int blue){
        if(colorRgb.containsValue(ConvertString(red,green,blue)))
            return true;
        else
            return false;
    }

}
