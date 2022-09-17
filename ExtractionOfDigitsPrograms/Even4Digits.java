//6. Display the sum of even digits which are greater than 4 in a number 
import java.util.Scanner;

class Even4Digits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0;
        while(n!=0)
        {
            rem=n%10;
            if (rem % 2 == 0 && rem > 4)
            {
                sum += rem;
            }
            n=n/10;
        }
        System.out.println("Sum of even digits greater than 4: " + sum);
        
        
        sc.close();
    }
}