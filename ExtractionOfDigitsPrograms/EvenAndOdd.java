//5. Display the count of even and odd digits in a number
import java.util.Scanner;

class EvenAndOdd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0, evencount = 0, oddcount = 0;
        while(n!=0)
        {
            rem=n%10;
            if (rem % 2 == 0)
            {
                evencount += 1;
            }
            else
            {
                oddcount += 1;
            }
            n=n/10;
        }
        System.out.println("Number of even digits: " + evencount);
        System.out.println("Number of odd digits: " + oddcount); 
        
        
        sc.close();
    }
}