package Java;
import java.util.Scanner;
public class UnerInputAddition 
{
    public static void main(String [] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the value of a:");
        a = inputScanner.nextInt();
        System.out.print("Enter the value of b:");
        b = inputScanner.nextInt();
        c = a+b;
        System.out.print("The sum of a and b:" +c);
        inputScanner.close();
    }
}
