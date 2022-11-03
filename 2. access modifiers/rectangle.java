class rectangle1 {
    private double length;
    private double breadth;

    double getLength() {
        return length;
    }

    void setLength(double l) {
        length = l;
    }

    double getBreadth() {
        return breadth;
    }

    void setBreadth(double b) {
        breadth = b;
    }

    // private rectangle1(double l,double b)
    // {
    // length = l;
    // breadth = b;
    // }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

// Practising data hiding
public class rectangle {
    public static void main(String[] args) {
        rectangle1 r = new rectangle1();
        r.setBreadth(5);
        r.setLength(6);
        System.out.println("area of rectangle is " + r.area());
        System.out.println("perimeter of rectangle is " + r.perimeter());

    }
}
