//15. Automorphic no (Find the square of the number and if the number is present at the end of its square it is automorphic number
import java.util.Scanner;
class Automorphic
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int squared = n * n, rem = 0, tens = 10;
        while (squared!=0)
        {
            rem = squared%tens;
            if (n == rem)
            {
                System.out.println("This is an autormorphic no");
                break;
            }
            tens = tens*10;
        }
        
        sc.close();
    }
}