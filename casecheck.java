import java.util.Scanner;
public class casecheck {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        char ch = input.next().trim().charAt(0);
        
        if(ch > 65 && ch < 90)
        {
            System.out.println("lowercase");

        }
        else 
        {
           System.out.println("uppercase"); 
        }
        input.close();
    }
}
