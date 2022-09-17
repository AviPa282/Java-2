//6. S= 1 + 3+ 7+ 15+ 31............ N terms 
import java.util.*;
public class OddSeries
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount of terms: ");
        int num1 = num.nextInt();
        int sum = 0; 
        for (int i = 1; i <= num1; i++)
        {
            sum += Math.pow(2, i) - 1;
            
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
