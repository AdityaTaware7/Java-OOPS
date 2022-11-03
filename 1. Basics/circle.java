
class Mycircle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class circle {
    public static void main(String[] args) {
        Mycircle c1 = new Mycircle();
        c1.radius = 7;

        System.out.println("Are of the circle is " + c1.area());
        System.out.println("Are of the circle is " + c1.circumference());
    }
}