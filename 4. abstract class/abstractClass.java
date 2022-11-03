abstract class shape{
    abstract public double perimeter();
    abstract public double area();
}

class circle extends shape{
    float radius;

    circle(int r)
    {
        this.radius = r;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
    public double area()
    {
        return Math.PI * radius * radius;
    }
}

class rectangle extends shape{
    float length;
    float breadth;

    public double perimeter()
    {
        return 2 * (length + breadth);
    }
    public double area()
    {
        return length * breadth;
    }
}

public class abstractClass {
    public static void main(String[] args) {
        shape s = new circle(5);
        System.out.println(s.area());
        
        System.out.println(s.perimeter());
        
    }
}
