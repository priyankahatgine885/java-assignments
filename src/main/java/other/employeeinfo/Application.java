package other.employeeinfo;
/*
Q. Create a class called Employee that includes three instance
variables—a first name (type String), a last name (type String)
and a monthly salary (double). Provide a constructor that
initializes the three instance variables. Provide a set and a
get method for each instance variable. If the monthly salary is
not positive, do not set its value. Write a test application
named
EmployeeTest
that
demonstrates
class
Employee’s
capabilities. Create two Employee objects and display each
object’s yearly salary. Then give each Employee a 10% raise and
display each Employee’s yearly salary again.
 */
public class Application {
    public static void main(String[] args) {
        int choice;
        EmployeeTest employee = new EmployeeTest();
        while( ( choice = EmployeeTest.menuList( ) ) != 0 ) {
            switch( choice ) {
                case 1:
                    employee.acceptRecord();
                    break;
                case 2:
                    employee.printRecord();
                    break;
            }
        }
    }
}
