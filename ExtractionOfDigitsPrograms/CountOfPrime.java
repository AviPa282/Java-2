//8. Display the count of prime digits in a number
import java.util.Scanner;

class CountOfPrime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0, count = 0;
        while(n!=0)
        {
            rem=n%10;
            int flag = 0;
            for (int i = 2; i<= rem/2; i++)
            {
                
                if (rem % i == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0 && rem != 1)
            {
                count += 1;
            }
            n=n/10;
        }
        System.out.println("The count of prime digits: " + count);
        
        sc.close();
    }
}