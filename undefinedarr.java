public class undefinedarr
{
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        int ans = search(arr,4);
        System.out.println(ans);

        
    }



    static int search(int[] arr,int target)
    {
        int start =0;
        int end=arr.length-1;
        int mid =start + (end - start)/2;

       while(start<=end)
       {

        if (arr[mid]==target)
            return  mid;

        else if(arr[start]<arr[end])
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
        }
        else
        
         if(target>arr[mid])
         {
              
            end=mid-1;
            mid = start + (end-start)/2; 
         }
        else if(target<arr[mid])
         {
            start=mid+1;
            mid = start + (end-start)/2;   
         }
        

        
       }
       return -1;
                   
    }
}