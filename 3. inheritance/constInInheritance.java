// Constructors in inheritance

class Parent{
    public Parent()
    {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent{
    public Child()
    {
        System.out.println("Child constructor");
    }
}

class GrandChild extends Child{
    public GrandChild()
    {
        System.out.println("GrandChild constructor");
    }
}


public class constInInheritance {
    public static void main(String[] args) {
        GrandChild c;
        c = new GrandChild();
    }
}
