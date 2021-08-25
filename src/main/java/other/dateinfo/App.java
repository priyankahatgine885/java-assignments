package other.dateinfo;
/*
Q. Create a class called Date that includes three instance
variables—a month (type int), a day (type int) and a year (type
int). Provide a constructor that initializes the three instance
variables and assumes that the values provided are correct.
Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month,
day and year separated by forward
slashes (/).
Write a test application named DateTest that demonstrates class
Date’s capabilities.
 */
public class App {
    public static void main(String[] args) {
        int choice;
        DateTest date = new DateTest();
        while( ( choice =  DateTest.menuList( ) ) != 0 ) {
            switch( choice ) {
                case 1:
                    date.acceptRecord();
                    break;
                case 2:
                    date.printRecord();
                    break;
            }
        }
        date.displayDate();
    }
}
