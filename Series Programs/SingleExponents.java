//5. S= 1*2 + 2*3 +3*4 ............ N terms
import java.util.*;
public class SingleExponents
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount of terms: ");
        int num1 = num.nextInt();
        int sum = 0; 
        for (int i = 1; i <= num1; i++)
        {
            sum += i * (i+1);
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
