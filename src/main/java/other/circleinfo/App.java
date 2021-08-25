package other.circleinfo;
/*
Q. Write an application that inputs from the user the radius of
a circle as an integer and prints the circle’s
diameter,
circumference and area using the floating-point value
3.14159 for π(PI).
Math.PI for the value of π(PI). This constant is more precise
than the value 3.14159. Class Math is defined in package
java.lang. Classes in that package are imported automatically,
so you do not need to import class Math to use it.
Use the following formulas (r is the radius):
diameter = 2r
circumference = 2πr
area = πr2
 */
public class App {
    public static void main(String[] args) {
        int choice;
        CircleTest circleTest = new CircleTest();
        while ((choice = CircleTest.menuList()) != 0) {
            switch (choice) {
                case 1:
                    circleTest.acceptRecord();
                    break;
                case 2:
                    circleTest.printRecord();
                    break;
            }
        }
    }
}
