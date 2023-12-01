
# # RGB_Color_Store_DesignPattern

1. Draw the class diagram for your solution.

![Design Pattern drawio (1)](https://user-images.githubusercontent.com/99614732/198826522-fcb6160c-7684-4115-b402-0a28476489a6.png)

### Solution Explanation:

### Liskov Substitution Principle Implementation:
- Created a superclass (GeneralColor) with the 'printColor()' method.
- Both 'DefaultColor' and 'RgbColor' classes inherit from 'GeneralColor' and override the 'printColor()' method accordingly.

### listValueOfRgb Class (inside RgbColor):
- Function: 'setValidValue' - Validates RGB numbers.
- Function: 'listOfValue' - Arranges validated numbers as a HashSet.
- Function: 'ConvertString' - Converts the numbers to a String format.
- Function: 'containsValue' - Checks if the values exist in a map (used to store listString).

### RgbColor Class:
- Uses 'listValueOfRgb' object to execute its functions.
- Implements Singleton Design Pattern for immutability and single instance creation.
- 'printColor()' inherited from 'GeneralColor' used to print RGB values.

### DefaultColor Class:
- Implements Singleton Design Pattern for immutability and single instance creation.
- 'printColor()' inherited from 'GeneralColor' used to print DefaultColor names.

### GeneralColor Class:
- Superclass for 'RgbColor' and 'DefaultColor' containing the 'printColor()' method.

### ColorCache Class:
- Creates one object of each color using the superclass 'GeneralColor's 'getInstance' function.
- Static initializer block initializes colors during program runtime.
- 'print()' function uses polymorphism to call the correct 'printColor()' method based on the object type.

## Required Code for the Application:
- Code for each class and their respective functions is written and implemented.

## Main Application:
- A main app has been created that calls the color store, demonstrating the functionalities explained above.
