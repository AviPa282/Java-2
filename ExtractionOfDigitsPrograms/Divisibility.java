//7. Display the digits of a number which are divisible by 4 and 2.
import java.util.Scanner;

class Divisibility
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0;
        while(n!=0)
        {
            rem=n%10;
            if (rem % 2 == 0 && rem % 4 == 0)
            {
                System.out.println("One digit divisible than 4 and 2: " + rem);
            }
            n=n/10;
        }
        
        
        sc.close();
    }
}