import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        // int x;
        // System.out.println("enter int value");
        // x = s.nextInt();
        // System.out.println("the entered value is " + x);
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        String str = s.nextLine();
        System.out.println("entered string is " + str);

        System.out.println("enter a float");
        float f = s.nextFloat();
        System.out.println("entered float is " + f);
    }
}
