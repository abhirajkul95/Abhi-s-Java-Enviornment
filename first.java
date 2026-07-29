import java.util.Scanner;
public class first
{
   public static void main(String args[])
   {
     System.out.println("Enter your Roll no");
     Scanner input = new Scanner(System.in);
     int Rollno = input.nextInt();
     System.out.println("Enter Your Name");
     input.nextLine();
     String name = input.nextLine();
     System.out.println("your name is "+ name);
     System.out.println("Your Roll no is " + Rollno);
     input.close();
   }
}