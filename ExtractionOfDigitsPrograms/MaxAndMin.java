//10. Display the maximum and minimum digit of a number .
import java.util.Scanner;

class MaxAndMin
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0, max = 0, min = 10;
        while(n!=0)
        {
            rem=n%10;
            if (max <= rem)
            {
                max = rem;
            }
            if (min >= rem)
            {
                min = rem;
            }
            n=n/10;
        }
        System.out.println("The maximum digit in this number is: " + max);
        System.out.println("The minimum digit in this number is: " + min);
        
        sc.close();
    }
}