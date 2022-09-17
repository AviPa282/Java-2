//13. Check for Special number (Sum of factorials of each digit of a number is equal to the number itself) java.util.Scanner;
import java.util.Scanner;
class SpecialNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0, n2=n;
        while(n!=0)
        {
            int factorial = 1;
            rem=n%10;
            for (int i = rem; i >=1;  i--)
            {
                factorial = factorial * i;
            }
            sum += factorial;
            n=n/10;
        }
        System.out.println("The sum of the factorials of the digits:  " + sum);
        if (sum == n2)
        {
            System.out.println("This is a special number");
        }
        sc.close();
    }
}