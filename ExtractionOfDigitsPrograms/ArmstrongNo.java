//11. Check for Armstrong no (Sum of cubes of each digit is equal to the original number) import java.util.Scanner;
import java.util.Scanner;
class ArmstrongNo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0, n2=n;
        while(n!=0)
        {
            rem=n%10;
            sum += Math.pow(rem, 3);
            n=n/10;
        }
        System.out.println("The sum of the cubes of the digits:  " + sum);
        if (sum == n2)
        {
            System.out.println("This is a armstrong number");
        }
        sc.close();
    }
}