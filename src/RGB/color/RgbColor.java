package RGB.color;

import java.util.*;

public class RgbColor extends GeneralColor  {
    private static ListValueOfRgb listValueOfRgb;
    private int red;
    private  int green;
    private  int blue;

//constructor
    private RgbColor(int red, int green , int blue) {
        this.red= red;
        this.green= green;
        this.blue= blue;
    }
    //instance
    private static RgbColor instance=null;
// get instance function
    public static final RgbColor getInstance(String color, int red , int green, int blue) {
        if(listValueOfRgb.setValidValue(red,green,blue)) {
            if (!listValueOfRgb.containsValue(red,green,blue)){
                synchronized (RgbColor.class) {
                    if (!listValueOfRgb.containsValue(red,green,blue)) {
                        instance= new RgbColor(red, green, blue);
                        listValueOfRgb.getColorRgb().put(color,listValueOfRgb.ConvertString(red,green,blue));
                    }
                }
            }else {
                System.out.println("A copy of it has been returned because it exists");
            }
        }
        return instance;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

@Override
public void printColor(Map.Entry<String, GeneralColor> entry){
    System.out.println(entry.getValue());
}


    @Override
    public String toString(){return "the value of Color RGB : "+this.red + " , " + this.green + " , " + this.blue;}

}