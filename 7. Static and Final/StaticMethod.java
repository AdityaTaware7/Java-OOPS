class Test
{
    static int x=10;
    int y=20;
    
    void show()
    {
        System.out.println(x+" "+y);
        // Non-static method can access static as well as non-static members ie variables
    }
    
    static void display()
    {
        System.out.println(x);
        // Static methods can access only static members ie variables
    }

    // Static class can only be nested inside non-static class ie outer class cannot be a static class only inner classes can be declared static.
}


public class StaticMethod {

    public static void main(String[] args) {
        
        Test t1=new Test();
        t1.show();
        t1.x=30;
        t1.y=50; 
        
        Test t2=new Test();
        t2.show();
        
    }
}
