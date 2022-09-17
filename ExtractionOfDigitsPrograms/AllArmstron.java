//12. Display all Armstrong no (Sum of cubes of each digit is equal to the original number) between x and y given by the user

import java.util.Scanner;
class AllArmstron
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting number: ");
        int x=sc.nextInt();
        System.out.println("Enter an ending number: ");
        int y = sc.nextInt();
        int rem=0,sum=0;
        for (int i = x; i <= y; i++)
        {
            int i2 = i;
            sum = 0;
            while(i2!=0)
        {
            rem=i2%10;
            sum += Math.pow(rem, 3);
            i2=i2/10;
        }
        if (sum == i)
        {
            System.out.println("The number " + i + " is an armstrong number");
        }
        else
        {
            System.out.println("The number " + i + " is not armstrong");
        }
        }
        
        sc.close();
    }
}