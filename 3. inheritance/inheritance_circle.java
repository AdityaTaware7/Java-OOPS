package inheritance;

/**
 * inheritance_circle
 */

class circle {
    public double radius;

    // constructor
    public circle(double r) {
        radius = r;
    }

    public circle() {
        radius = 1;
    }

    // methods
    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

/**
 * cylinder
 */
class cylinder extends circle {
    public double height;

    // constructors
    public cylinder() {
        height = 1;
    }

    public cylinder(double h) {
        height = h;
    }

    // methods
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class inheritance_circle {
    public static void main(String[] args) {
        // circle c1 = new circle();
        // System.out.println("the area of c1 is "+ c1.area());

        cylinder c2 = new cylinder();
        c2.radius = 7;
        c2.height = 10;
        System.out.println("the area of cylinder c2 is " + c2.area());
        System.out.println("the volume of cylinder c2 is " + c2.volume());
    }
}