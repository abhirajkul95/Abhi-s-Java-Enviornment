import java.util.Scanner;
public class linearsearch {

    public static void main(String[] args) {
        int[] arr = new int[5];

        input(arr);
       int ans = search(arr,45);
       System.out.print("item found at: "+ ans);
        
        
    }

    static void input(int arr[])
    {   
        
        System.out.print("enter an array: ");
        Scanner input = new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            arr[i]=input.nextInt();
        }
        input.close();

    }

    static int search(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }

        for(int i=0;i<5;i++)
        {
            if(arr[i]==target)
            {
                return i;
                
            }
        }

        return -1;
    }    
}
