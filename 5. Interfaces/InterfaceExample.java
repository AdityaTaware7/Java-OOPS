class Phone 
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

// we use I for interface
interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

// a class can implement multiple interfaces but it can extend from only one parent class
class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
   
    // from Icamera
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    // from IMusicPlayer
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }

}
public class InterfaceExample 
{
    public static void main(String[] args) 
    {
        Phone p = new SmartPhone();
        p.call();
        p.sms();

        SmartPhone s = new SmartPhone();
        s.videoCall();

        ICamera sm=new SmartPhone();
        sm.click();
        sm.record();

        IMusicPlayer sp=new SmartPhone();
        sp.play();
        sp.stop();
        
    }
}