//2. Find the sum of squares of each digit of a number
import java.util.Scanner;

class SquaresSum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0;
        while(n!=0)
        {
            rem=n%10;
            sum += Math.pow(rem, 2);
            n=n/10;
        }
        System.out.println("Sum of square of digits:" + sum);
        
        
        sc.close();
    }
}