//1. Find Sum, average and count of digits of a number
import java.util.Scanner;

class SumAvgCount
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem=0,sum=0, count = 0;
        float average = 0;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
            count += 1;
        }
        average = sum / count;
        System.out.println("Sum of digits:"+sum);
        System.out.println("Average of digits : " + average);
        System.out.println("Count of digits: " + count);
        
        sc.close();
    }
}