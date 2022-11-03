class Test
{
    static
    {
        System.out.println("Block 1");
    }
    
    static
    {
    System.out.println("Block 2");
    }
}

public class StaticBlock {

    
    
    /*static
    {
        System.out.println("Block 1");
    }*/
    // try uncommenting this and run the program.
    
    
    public static void main(String[] args) 
    {
        //Test t=new Test();
        System.out.println("Main");
        Test t=new Test();
        // Static methods dont need to be called, they execute directly when a class is writeen/loaded
    }
    
    /*static
    {
    System.out.println("Block 2");
    }*/
    
}