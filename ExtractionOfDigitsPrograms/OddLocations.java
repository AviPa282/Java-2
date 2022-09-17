//9. Display the sum of digits at odd locations of a number. Display the digits of a number which are divisible by 4 and 2
import java.util.Scanner;

class OddLocations
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0;
        while(n!=0)
        {
            rem=n%10;
            sum += rem;
            n=n/100;
        }
        System.out.println("The sum of the digits at odd locations: " + sum);
        
        sc.close();
    }
}