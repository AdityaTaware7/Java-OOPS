// When we declare the same method from super/parent class into the sub/child class it is known as method overriding.
class Super{
    public void display()
    {
        System.out.println("hello! method from Super class");
    }
}

class Sub extends Super{
    @Override
    public void display()
    {
        System.out.println("hello worlddd! method from Sub class");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        // Super s1 = new Super();
        // s1.display();
        
        // "display" Method is overriden in sub class
        // Sub s2 = new Sub();
        // s2.display();

        // Dynamic Method Dispatch
        Super s = new Sub();
        s.display();
    }
}
