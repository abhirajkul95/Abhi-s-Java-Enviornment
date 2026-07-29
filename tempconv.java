import java.util.Scanner;


public class tempconv {

 public static void main(String[] args) {
    System.out.print("enter temp in celcius");
    Scanner input = new Scanner(System.in);
    
    float cel = input.nextFloat();
    double far = (cel * 1.8) + 32;
    System.out.print("temp in farheinheit is :" + far);
    input.close();
 }
}