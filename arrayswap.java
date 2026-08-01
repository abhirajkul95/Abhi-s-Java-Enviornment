
import java.util.Scanner;

public class arrayswap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("please enter five numbers : ");
        
        int[] arr = new int[5];

        for(int i=0; i<5; i++)
        {
           arr[i] = input.nextInt();
        }

        for(int i=0; i<5; i++)
        {
           System.out.print(arr[i] + " ");
        }
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        for(int i=0; i<5; i++)
        {
           System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
