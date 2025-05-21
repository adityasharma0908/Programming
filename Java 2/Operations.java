package Java;
import java.util.Scanner;

public class Operations 
{
    public static void main (String [] args)
    {
        Scanner inputtaker = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the first number:");
        a = inputtaker.nextInt();
        System.out.println("Enter the second number:");
        b = inputtaker.nextInt();
        System.out.println("For addition press: 1 \nFor substraction press: 2 \nFor division press: 3 \n11For multiplication press: 4");
        System.out.println("Enter the operation choice:");
        c=inputtaker.nextInt();
        switch (c)
        {
            case 1:
                int d = a+b;
                System.out.println("Sum="+d);
                break;
            case 2:
                int e = a-b;
                System.out.println("Difference="+e);
                break;
            case 3:
                int f = a/b;
                System.out.println("Divison="+f);
                break;
            case 4:
                int g = a*b;
                System.out.println("Product="+g);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    
    inputtaker.close();
    }
}
