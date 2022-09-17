//9. S= 1/2! + 3/4! + 5/6! +7/8... N terms 
import java.util.*;
public class Factorial3Series
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount of terms: ");
        int num1 = num.nextInt();
        float sum = 0;
        int x = 2; 
        float y = 1; 
        for (int i = 1; i <= num1; i++)
        {
            int factorial = 1;
            for (int j = x; j>=1; j--)
            {      
                factorial = factorial * j;
            }
            sum += y / factorial;
            x += 2;
            y += 2;
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
