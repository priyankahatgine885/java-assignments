package other.dateinfo;
import other.dateinfo.model.Date;
import java.util.Scanner;

public class DateTest {
    private Date date = new Date();
    private static Scanner sc = new Scanner(System.in);

    public void acceptRecord() {
        System.out.print("Day	:	");
        this.date.setDay(sc.nextInt());
        System.out.print("Month	:	");
        this.date.setMonth(sc.nextInt());
        System.out.print("Year	:	");
        this.date.setYear(sc.nextInt());
    }

    public void printRecord() {
        System.out.println("Day	: " + this.date.getDay());
        int month = date.getMonth();
        System.out.println("Month : " + this.date.getMonth());
        int year = date.getYear();
        System.out.println("Year : " + this.date.getYear());
    }

    public static int menuList() {
        System.out.println("0.Exit");
        System.out.println("1.Accept Record");
        System.out.println("2.Print Record");
        System.out.print("Enter choice	:	");
        return sc.nextInt();
    }

    public void displayDate() {
        System.out.println("Day :" + this.date.getDay() + " /" + "Month :" + this.date.getMonth() + "/" + "Year :" + this.date.getYear());
    }
}
