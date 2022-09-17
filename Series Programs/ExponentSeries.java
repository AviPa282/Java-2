//4. S= x+ x^2 + x^3 + x^4 ............ N terms
import java.util.*;
public class ExponentSeries
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount of terms: ");
        int num1 = num.nextInt();
        System.out.println("Enter the value of x: ");
        int x = num.nextInt();
        int sum = 0; 
        
        for (int i = 1; i <= num1; i++)
        {
            sum += Math.pow(x, i);
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
