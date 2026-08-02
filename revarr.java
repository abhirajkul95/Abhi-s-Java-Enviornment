import java.util.Arrays;

public class revarr {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //swap(arr,0,4);
        rev(arr);

        System.out.println(Arrays.toString(arr));
        
        

    }

    static void rev(int[] arr)
    {
       int head=0;
       int tail=arr.length-1;

       while(head<tail)
       { 
          swap(arr,head,tail);
          head++;
          tail--;
       }
    }

    static void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
