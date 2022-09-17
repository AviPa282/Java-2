//13. S= 1 + 12+ 123+ 1234+ ....... N terms
import java.util.*;
public class Adv4Series
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount of terms: ");
        int num1 = num.nextInt();
        int sum = 0;
        int num2 = 0;
        for (int i = 1; i <= num1; i++)
        {
            num2 = num2 * 10 + i;
            sum += num2;
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
