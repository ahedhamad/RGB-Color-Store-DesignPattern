
# assignment_4_DesignPattern

1. Draw the class diagram for your solution.

![Design Pattern drawio (1)](https://user-images.githubusercontent.com/99614732/198826522-fcb6160c-7684-4115-b402-0a28476489a6.png)


2. Explain your solution :

•	Based on the Liskov Substitution Principle, creating a class (GeneralColor) that contains the printColor() method, and both classes (Default Color) and class (Rgb Color) are inherited from it, then simple changes to the override printColor() method.
----
1.	listValueOfRgb class : the aim of it is to check the RGB numbers if they are valid using a function (setValidValue) then they are arranged as HashSet using a function (listOfValue) and then converted toString using a function (ConvertString) then look if they exist in the map (that was created To store listString in it) using a function (containsValue) ,
so that an object from this class was created in the RGB Color class.
((((A comment will be placed above each function to clarify it))))
----
2.	RgbColor class : Contains 1-  Object of Class (listValueOfRgb) to use all of its functions , in function get instance. 2- Three variables (red, blue, green) were used, and keyWord –final-- was used to make all the objects immutable. 3- The Singleton Design Pattern has been applied to make the private Constructor(RgbColor) and private Instance of the RgbColor type, and Function(getInstance) creates only one object of the same color.
((((A comment will be placed above each function to clarify it)))), 4-printColor() to be called in Class ColorCache and it was inherited from Class GeneralColor , it prints the value for RGB color, and takes a map of the type of <String , GeneralColor >.
----
3.	DefaultColor class :1- one variables (name) were used, and keyWord –final-- was used to make all the objects immutable. 2- The Singleton Design Pattern has been applied to make the private Constructor(DefaultColor) and private Instance of the DefaultColor type, and Function(getInstance) creates only one object of the same color.
((((A comment will be placed above each function to clarify it)))), 3- printColor() to be called in Class ColorCache and it was inherited from Class GeneralColor , it prints the key (nameColor) for DefaultColor, and takes a map of the type of <String , GeneralColor >.
GeneralColor class : It is the SuperClass for both SubCalss (RgbColor) and (DefaultColor) , has a function printColor() it prints the value for RGB color, and takes a map of the type of <String , GeneralColor >.
----
4.	ColorCash class : contains 1 one object of each color was created using the function (getInstance) of the super-class (GeneralColor) so that the polymorphism was applied .
2- static{} It contains the colors that are built when the program is running -initializer block. 3- print() function : It checks if the object is of the default type, it calls Function PrintColor() from Default Color Class, otherwise calls Function PrintColor() from RGB Class .
*Note that all the objects are stored in the Map<String, GeneralColor> generalColor.
----


3. Write required code for the application
(done)
4. Write the Main app that calls the color store showing the requirements above
(done)
