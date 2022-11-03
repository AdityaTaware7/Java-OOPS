// When all methods of a class are abstract we use Interfaces instead of abstract classes

// Abstract class example BELOW

// abstract class test1{
//     abstract public void method1();
//     abstract public void method2();
// }

// class test2 extends test1 {
//     public void method1()
//     {
//         System.out.println("this is method 1");
//     }

//     public void method2()
//     {
//         System.out.println("this is method 2");
//     }
// }

// Interfaces class example BELOW considering above abstract classes

// Interface can be called as an abstract class with all abstract methods ie it doesn't share any methods to child class
interface TEST1{
    void meth1();
    void meth2();
}

class TEST2 implements TEST1{
    public void meth1()
    {
        System.out.println("this is meth 1");
    }
    public void meth2()
    {
        System.out.println("this is meth 2");
    }
}

// Purpose of abstract
public class interfaces {
    public static void main(String[] args) {
        // For Abstract class 
        // test1 t = new test2();
        // t.method1();

        // For interface class 
        TEST1 t = new TEST2();
        t.meth1();
    }
    

}
