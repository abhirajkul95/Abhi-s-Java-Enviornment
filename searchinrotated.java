public class searchinrotated {
    public static void main(String[] args) {

        int[] arr ={4,5,6,7,8,1,2,3};
        int ans=search(arr,1);
        System.out.println(ans);
        
    }

    static int binsearch(int[] arr,int target,int start,int end)
    {
        
        while(start<=end)
        {
           int mid = start + (end-start)/2;

           if(target>arr[mid])
           {
            start=mid+1;
           }
           else if(target<arr[mid])
           {
            end=mid-1;
           }
           else return mid;
        }
        return -1;
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
            if(arr[mid]<arr[start])
            {
                end=mid-1;
            }
            else start=mid+1;
        }
        return -1;

    }

    static int search(int arr[],int target)
    {
         int pivot = pivotsearch(arr);
         if(pivot==-1)
         {
            return binsearch(arr,target,0,arr.length-1);
         }

         if(arr[pivot]==target)
         {
            return pivot;
         }

         if(target>=arr[0])
         {
            return binsearch(arr,target,0,pivot);
         }
         else return binsearch(arr,target,pivot+1,arr.length-1);
    
     
     }
}
