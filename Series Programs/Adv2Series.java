//11. S= 1/1 + (1+2)/ (1*2) + (1+2+3)/ (1*2*3)......... (1+2+3.......N)/(1*2*3..N)  
import java.util.*;
public class Adv2Series
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the amount of terms: ");
        int num1 = num.nextInt();
        float sum = 0;  
        for (int i = 1; i <= num1; i++)
        {
            float x = 0;
            float y = 1;
            for (int j = i; j >= 1; j--)
            {
                x += j;
                y = y * j;
            }
            sum += x/y;
        }
        System.out.println("The final sum of the series is: " + sum);
        num.close();
        
    }
    
}
