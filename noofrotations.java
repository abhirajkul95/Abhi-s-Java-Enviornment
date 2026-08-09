public class noofrotations {
    public static void main(String[] args) {

        int arr[]={2,3,4,5,6,7,1};
        int pivot=pivotsearch(arr);
        int end=arr.length-1;
        int rotations;
        if(pivot==-1)
        {
           rotations=0;
        }
        else rotations= end - pivot;
        System.out.println(rotations);
        

    }

    static int pivotsearch(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        
        while(start<end)
        {
            int mid=start + (end-start)/2;

            if(arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(arr[mid]<arr[mid-1])
            {
                return mid-1;
            }

            if(arr[mid]==arr[start] && arr[mid]== arr[end])
            {
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1])
                {
                    return end-1;
                }
                end--;
            }
            if(arr[mid]<arr[start] || (arr[mid]==arr[start] && arr[mid]>arr[end]))
            {
                end=mid-1;
            }
            else start=mid+1;
        }
        return -1;

    }
    

}
