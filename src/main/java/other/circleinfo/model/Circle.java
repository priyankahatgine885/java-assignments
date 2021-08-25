package other.circleinfo.model;

public class Circle {
    private int radius;
    public static final float PI = 3.14f;
    double diameter;
    double circumference, area;
    public Circle() {

    }
    public Circle(int radius) {
        super();
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public static float getPi() {
        return PI;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getDiameter() {
        return diameter;
    }
    public double getCircumference() {
        return circumference;
    }
    public double getArea() {
        return area;
    }
    public String toString() {
        return String.format("%d%f", this.radius, this.PI);
    }
}
