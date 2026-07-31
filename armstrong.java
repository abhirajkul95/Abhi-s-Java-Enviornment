import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
    armstrongfun();
    }

    static void armstrongfun()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter a number");
        int a = in.nextInt();
        int sum=0;
        int temp = a;
        
        while(temp>0)
        {
           int rem = temp % 10;
           int cube = rem*rem*rem;
           sum = sum + cube;
           temp=temp/10;
        }
        
        if (sum == a)
            System.out.println("Its an armstrong number");
        else 
            System.out.println("not an armstrong number");
        in.close();

    }
}
