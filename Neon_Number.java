package Assignment;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();

            int sq = n*n;
            
            int sum=0;
            while(sq>0)
            {
                int rem=sq%10;
                sq/=10;
                sum+=rem;
            }

            if(sum==n)
                System.out.println("Your number is a Neon Number");
            else
                System.out.println("Your number is not a neon number");
        }
        finally
        {
            sc.close();
        }
    }
}
