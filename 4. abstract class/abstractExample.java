// Abstract methods and classes are only meant for inheritance.

// abstract class
abstract class Super
{
    Super()
    {
        System.out.println("Super");
    }
    void meth1()
    {
        System.out.println("Super meth1");
    }
    // abstract method.
    abstract void meth2();
}
// concrete class
class sub extends Super
{
    void meth2()
    {
        System.out.println("Sub meth2");
    }
}


public class abstractExample {
    public static void main(String[] args)
    {
        Super s1; // only reference of abstract is allowed
        // sub s2 =new sub();
        Super s = new sub();
        s.meth1(); // Called from abstract class
        s.meth2();  // Called from concrete class
    }
}
