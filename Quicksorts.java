import java.util.Arrays;

public class Quicksorts {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int high,int low)
    {
        int s=low;
        int e=high;
        int pivot=s+(e-s)/2;

        while(s<=e)
        {
            while(arr[s]<pivot)
            {
              s++;
            }
            while(arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;e--;
            }
        }
    }
}
