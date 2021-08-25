package other.circleinfo;
import other.circleinfo.model.Circle;
import java.util.Scanner;

public class CircleTest {
    private Circle circle = new Circle();
    private static Scanner sc = new Scanner(System.in);

    public void acceptRecord() {
        System.out.println("Enter radius	:	");
        this.circle.setRadius(sc.nextInt());
    }
    public void printRecord() {
        double diameter;
        double circumference, area;
        diameter = 2 * this.circle.getRadius();
        circumference = 2 * this.circle.PI * this.circle.getRadius();
        area = this.circle.PI * this.circle.getRadius() * this.circle.getRadius();
        System.out.println("Radius	: " + this.circle.getRadius());
        System.out.println("PI Value : " + Circle.getPi());
        System.out.println("The diameter is " + diameter );
        System.out.println("The circumference is " + circumference);
        System.out.println("The area is " + area);
    }
    public static int menuList() {
        System.out.println("0.Exit");
        System.out.println("1.Accept Record");
        System.out.println("2.Print Record");
        System.out.print("Enter choice	:	");
        return sc.nextInt();
    }
}
