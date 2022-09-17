//10. S= (10*1) /3 + (20*3)/5 + (30*5)/7............ N terms
import java.util.*;
public class AdvSeries
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount of terms: ");
        int num1 = num.nextInt();
        float sum = 0; 
        float x = 1;
        float y = 10; 
        for (int i = 1; i <= num1; i++)
        {
            sum += y * x/ ( x + 2);
            x = x + 2;
            y = y + 10;
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
