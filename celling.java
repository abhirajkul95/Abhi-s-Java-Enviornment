public class celling {
    public static void main(String[] args) {

        int[] arr={2,4,6,54,69,78,456};
        int cel=celling(arr,55);
        System.out.println("celling of array is : "+cel);
        
    }

    static int celling(int[] arr,int target)
    { 
        int start=0;
        int end=arr.length-1;
        int mid =start +  (end -start)/2;

        while(start<=end)
        {
            if(target>arr[mid])
            {
                start=mid+1;
                mid =start +  (end -start)/2;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
                mid =start +  (end -start)/2;
            }
            else
            return mid;
        }
        return arr[start];
    }
    
}
