import java.util.Scanner; 
public class calc {
    public static void main(String[] args) {
        int ans = 0;
        Scanner input = new Scanner(System.in);
        while(true)
        {
           System.out.print("please enter an operator : ");
           char op = input.next().trim().charAt(0);
           if (op == '+' || op == '-' || op == '*' || op == '/' || op =='%' )
           {
             System.out.print("please enter a : ");
             int a =input.nextInt();
             System.out.print("please enter b : ");
             int b =input.nextInt();

             if(op == '+')
             {
                ans = a + b;
             }

             if(op == '-')
             {
                ans = a - b;
             }
              if(op == '*')
             {
                ans = a * b;
             }
              if(op == '/')
             {
                ans = a/b;
             }
              if(op == '%')
             {
                ans = a % b;
             }

           }
           if(op == 'x')

            break;
            System.out.println(ans);
            
           
        }
        input.close();

        

    }
}
