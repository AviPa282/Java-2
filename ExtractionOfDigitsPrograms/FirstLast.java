//3. Find sum of first and last digit of a number
import java.util.Scanner;

class FirstLast
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0, last;
        int n2 = n;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
        }
        last = n2%10;
        sum = rem + last;
        System.out.println("Sum of square of digits:" + sum);
        
        
        sc.close();
    }
}