public class binarysearch {
    public static void main(String[] args) {
        int[] arr={21,22,23,24,34,45,56,76,89,76};
        int result=search(arr,45);
        System.out.println(result);
        
    }

    static int search(int [] arr,int target)
    {
       int start=0;
       int end=arr.length-1;
       int mid = start + (end-start)/2;
       

       while(start<=end)
       {
        
        if(target>arr[mid])
        {
            start=mid+1;  
            mid = start + (end-start)/2; 
        }
        else if(target<arr[mid])
        {
            end=mid-1;  
            mid = start + (end-start)/2;   
        }
        else return mid;
            
        
       }
       return -1;
    }
}
