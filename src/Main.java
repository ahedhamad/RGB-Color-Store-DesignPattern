import RGB.ColorCache;

import RGB.color.DefaultColor;
import RGB.color.ListValueOfRgb;


public class Main {
    public static void main(String[] args) {
        System.out.println(ColorCache.generalColor.get("Red"));
        System.out.println(ColorCache.generalColor.get("Green"));
        System.out.println(ColorCache.generalColor.get("Blue"));
        System.out.println(ColorCache.generalColor.get("White"));
        System.out.println(ColorCache.generalColor.get("Black"));

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(ListValueOfRgb.getColorRgb());
        System.out.println(DefaultColor.getDefaultColor());
        System.out.println("----------------------------------------------------------------------------");
        ColorCache.print();
    }

}