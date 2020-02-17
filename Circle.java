package lecture;

public class Circle {
    private double radius;             //radius of a circle

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calcCircumference() {
        return Math.PI * 2 * radius;
    }

    public String toString() {
        return "Circle with radius " + radius;
    }
}
