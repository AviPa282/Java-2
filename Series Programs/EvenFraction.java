//3. S= 2/4 +4/6+6/8................. N terms 
import java.util.*;
public class EvenFraction
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount of terms: ");
        int num1 = num.nextInt();
        float sum = 0;
        int x = 2; 
        
        for (int i = 1; i <= num1; i++)
        {
            sum += x / (x + 2);
            x += 2;
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
