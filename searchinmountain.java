public class searchinmountain
{
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,3,1};
        int top = peak(arr);
        int res = search(arr,5,top);
        System.out.println(res);
        
    }

    static int search(int[] arr,int target,int peak)
    {
      if(arr[peak]==target)
      {
        return peak;
      }
      if(target<arr[peak]){
      int firstry= binsearch(arr,target,0,peak-1);
      if(firstry!=-1)
      {
        return firstry;
      }
      else return binsearch(arr,target,peak+1,arr.length-1);
    }
    else return -1;
    }

    static int binsearch(int[] arr,int target,int start,int end)
    {
  
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

    static int peak(int[] arr)
    {
           int start=0;
       int end=arr.length-1;
       

       while(start<end)
       {
        int mid = start + (end-start)/2;

        if(arr[mid]>arr[mid+1])
        {
            end=mid;
            
        }

        else 
        start=mid+1;

       }


        return start;

  
    }
}