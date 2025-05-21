package Java;
import java.util.Scanner;
public class IfElse {
    public static void main(String [] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        int a;
        System.out.println("Enter the value of a: ");
        a = inputScanner.nextInt();

        if (a>0)
        {
            System.out.print("The number is positive.");
        }
        else if (a<0)
        {
            System.out.print("The number is negative.");
        }
        else
        {
            System.out.print("The number is zero.");
        }
        inputScanner.close();
    }
}