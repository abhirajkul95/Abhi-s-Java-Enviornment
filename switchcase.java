import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        System.out.print("enter a fruit : ");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch(fruit)
        {
          case "mango" -> System.out.println("king of fruits");
          case "apple" -> System.out.println("keeps doctor away");
          case "Orange" -> System.out.println("Fruit from nagpur");
          default -> System.out.println("please enter a valid fruit");
        }
        input.close();
        
    }
}
