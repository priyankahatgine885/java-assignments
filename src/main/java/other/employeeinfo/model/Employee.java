package other.employeeinfo.model;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    public Employee() {
        this.firstName = null;
        this.lastName = null;
        this.salary = 0.0;
    }
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        }
        else {
            this.salary = 0.0;
        }
    }
    public double getMonthlySalary() {
        return salary * 12;
    }
    public String toString() {
        return String.format("%30s%20s%10.3f", this.firstName, this.lastName, this.salary);
    }
}
