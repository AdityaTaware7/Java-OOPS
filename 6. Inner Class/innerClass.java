class Outer
{
    static int x=10;
    Inner i=new Inner();
    
    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisplay()
    {
        
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}


public class innerClass {
    public static void main(String[] args) 
    {
        // Creating object of inner class and accessing methods
        Outer.Inner oi=new Outer().new Inner();
        oi.innerDisplay();
        
    }
}
