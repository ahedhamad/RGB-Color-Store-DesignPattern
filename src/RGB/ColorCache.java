package RGB;

import RGB.color.DefaultColor;
import RGB.color.GeneralColor;
import RGB.color.RgbColor;

import java.util.HashMap;
import java.util.Map;

public class ColorCache {
  public static final GeneralColor redColor=RgbColor.getInstance("Red",255,66,55);
  public static final GeneralColor greenColor=RgbColor.getInstance("Green",22,99,33);

  public static final GeneralColor blueColor=RgbColor.getInstance("Blue",89,34,99);
  public static final GeneralColor blackColor=DefaultColor.getInstance("Black");
  public static final GeneralColor whiteColor=DefaultColor.getInstance("White");
  public final static Map<String, GeneralColor> generalColor = new HashMap<>();
  static {
    generalColor.put("Red", redColor);
    generalColor.put("Green", greenColor);
    generalColor.put("Blue", blueColor);
    generalColor.put("Black", blackColor);
    generalColor.put("White", whiteColor);

  }
  public static void print() {
    for (Map.Entry<String, GeneralColor> entry : generalColor.entrySet()) {
     if (entry.getValue() instanceof DefaultColor) {
        whiteColor.printColor(entry); // can use blackColor or whiteColor because they are both of the DefaultColor type so that I can reach the print() method
      } else {
       redColor.printColor(entry); // can use redColor/ blueColor/ greenColor because they are both of the RGBColor type so that I can reach the print() method
      }

    }

  }
}