package other.shapeinfo;
/*
Q. Write a class Rectangle, Circle and Triangle to calculate
area and perimeter. Write a menu driven program and test the
functionality in main.
 */
public class App {
    public static void main(String[] args) {
        int choice;
        Tester tester = new Tester();
        while ((choice = Tester.menuList()) != 0) {
            switch (choice) {
                case 1:
                    tester.acceptRecordForCircle();
                    tester.printRecordForCircle();
                    break;
                case 2:
                    tester.acceptRecordForRectangle();
                    tester.printRecordForRectangle();
                    break;

                case 3:
                    tester.acceptRecordForTriangle();
                    tester.printRecordForTriangle();
                    break;
            }
        }
    }
}
