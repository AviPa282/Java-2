//2. S= 2-4+6-8.......40 
import java.util.*;
public class EvenSings
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
            sum += x * y;
            x += 2;
            y = y*-1;
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
