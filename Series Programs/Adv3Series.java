//12. S= x^2/2! + X^4/4! + X^6/6! ............... N terms 
import java.util.*;
public class Adv3Series
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount of terms: ");
        int num1 = num.nextInt();
        System.out.println("Enter another number: ");
        int num2 = num.nextInt();
        float sum = 0;
        int x = 2; 
        for (int i = 1; i <= num1; i++)
        {
            int factorial = 1;
            for (int j = x; j>=1; j--)
            {      
                factorial = factorial * j;
            }
            sum += Math.pow(num2, x) / factorial;
            x += 2;
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
