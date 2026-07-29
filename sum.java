import java.util.Scanner;
public class sum {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
         System.out.print("enter first number");
         int a = input.nextInt();
         System.out.print("Enter second number");
         int b = input.nextInt();
         int add = a + b;
         System.out.println("Sum is : " + add);
         input.close();
    }
}
