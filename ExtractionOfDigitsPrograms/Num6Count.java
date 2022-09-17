//4. Display the count of no of times digit 6 is present in a number
import java.util.Scanner;

class Num6Count
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0,count = 0;
        while(n!=0)
        {
            rem=n%10;
            if (rem == 6)
            {
                count += 1;
            }
            n=n/10;
        }
        System.out.println("Number of times 6 is present: " + count);
        
        
        sc.close();
    }
}