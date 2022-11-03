class Test {
    public final void show()
    {
        System.out.println();
    }
}

class Test1 extends Test
{
    //public void show()
    // {
    // }
    //gives error as final methods cannot be overloaded.
}


public class FinalKeyword {
    // final float PI;
    
    // public FinalKeyword()
    // {
    //     PI=3.1425f;
    // }
    
    public static void main(String[] args) {
        
        final float PI = 3.1425f;
        // one way of declaring final variable inside a method

        // final float PI;
        // PI=3.1425f;
        // 2nd way is by declaring final variable

        // And 3rd way is by declaring it in the constructor as shown in FinalKeyword class

        System.out.println(PI);
        
    }
    
}
