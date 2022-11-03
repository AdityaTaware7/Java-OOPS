class Super
{
    private void display()//or even protected may not give any error.
    {
        System.out.println("Super display.");

    }
}

class Sub extends Super    
{
    //@Override if public
    public void display()
    {
        System.out.println("Sub diaplay.");
        
    }
}

public class OverrideRules {

    public static void main(String[] args) {
        
        Sub s=new Sub();
        s.display();
        // While method overriding the methods should have the same signature i.e. the Name of methods must be same also no different arguments must be passed as well as return type must be the same. Everything must be same except the body of the method. 
    }
    
}
