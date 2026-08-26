import java.util.Arrays;

public class bubblerec {
    public static void main(String[] args) {
        int[] arr={3,1,2,5,4};
        sort(arr,1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int i,int j)
    {
        if(i<=j)
        {
        if(arr[i]<arr[i-1])
        {
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        sort(arr,i+1,j);
        }else return;
        
       

    }
}
