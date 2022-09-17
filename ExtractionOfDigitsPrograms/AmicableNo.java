//14. Check for Amicable number (Two numbers A and B are said to be amicable if the sum of factors of first number excluding the no itself is equal to the second number and vice versa);

import java.util.Scanner;
class AmicableNo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter another number: ");
        int n2 = sc.nextInt();
        int rem=0,sum=0, sum2 = 0;
        for (int i = 1; i <= n/2; i++)
        {
            if (n%i == 0)
            {
                sum += i;
            }
        }
        System.out.println("The sum of the factors of the number 1:  " + sum);
        for (int j = 1; j <= n2/2; j++)
        {
            if (n2%j == 0)
            {
                sum2 += j;
            }
        }
        System.out.println("The sum of the factors of the number 2: " + sum2);
        if (sum == n2 && sum2 == n)
        {
            System.out.println("These numbers are amicable");
        }
        sc.close();
    }
}