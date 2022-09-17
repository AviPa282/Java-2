//8. S= 2! - 4! + 6! -8!  ............ N terms
import java.util.*;
public class Factorial2Series
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount of terms: ");
        int num1 = num.nextInt();
        int sum = 0;
        int x = 2; 
        int y = 1;
        for (int i = 1; i <= num1; i++)
        {
            int factorial = 1;
            for (int j = x; j>=1; j--)
            {      
                factorial = factorial * j;
            }
            sum = sum + (factorial * y);
            x += 2;
            y = y * -1;
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
