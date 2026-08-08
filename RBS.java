public class RBS {
    public static void main(String[] args) {

        int[] arr={4,5,6,7,1,2,3};
        int ans=searchpivot(arr);
        System.out.println(ans);
        
    }

    static int searchpivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }

            if(end>start && arr[mid]<arr[mid-1])
            {
                return arr[mid-1];
            }

            if(arr[start]>=arr[mid])
            {
                end=mid-1;
            }else{
                start=mid+1;
            }

            
        }

        return-1;
    }
}
