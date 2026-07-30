import java.util.Scanner;
public class primefun {

    public static void main(String[] args) {
        System.out.print("please enter a number:");
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = isprime(n);
        System.out.print(ans);
        input.close();
    }
     static boolean isprime(int n)
     {
       int c = 2;
       if (n <= 1)
       {
        return false;
       }
       while(c*c < n)
       {
        if(n % c == 0)
        {
            return false;
        }
        c++;
        
       }
       return c*c > n;
     }
}
