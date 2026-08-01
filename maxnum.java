import java.util.Scanner;

public class maxnum {
    
    public static void main(String[] args) {
        
        System.out.print("please enter five numbers :");

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        int i;

        for( i=0; i<5; i++)
        {
            arr[i]=input.nextInt();
        }

        for( i=0; i<5; i++)
        {
            System.out.println(arr[i] + " ");
        }

        System.out.print("maximum value is " +max(arr));



        input.close();
    }

            static int max(int[] arr)
        {
           int maxval = arr[0];

           for(int i=1; i<5; i++)
           {
             if(arr[i]>maxval)
             {
                maxval=arr[i];
             }
           }
           return maxval;
        }
}
