package other.employeeinfo;

import other.employeeinfo.model.Employee;

import java.util.Scanner;

public class EmployeeTest {
    private Employee emp = new Employee();
    private static Scanner sc = new Scanner(System.in);
    public void acceptRecord() {
        System.out.println("Enter First Name	:	");
        this.emp.setFirstName(sc.nextLine());
        System.out.println("Enter Last Name	:	");
        this.emp.setLastName(sc.nextLine());
        System.out.println("Enter salary	:	");
        this.emp.setSalary(sc.nextDouble());
        sc.nextLine();
    }
    public void printRecord() {
        System.out.println("First Name	: " + this. emp.getFirstName());
        System.out.println("Last Name : " + this.emp.getLastName());
        System.out.println("Salary : " + this. emp.getSalary());
        System.out.println("Yearly salary : " + this.emp.getSalary() * 12);
        double incrementedSalary = emp.getSalary() + this.emp.getSalary() * 0.1;
        System.out.println("IncrementedSalary : " + incrementedSalary);
    }
    public static int menuList( ) {
        System.out.println("0.Exit");
        System.out.println("1.Accept Record");
        System.out.println("2.Print Record");
        System.out.print("Enter choice	:	");
        return sc.nextInt();
    }
}
