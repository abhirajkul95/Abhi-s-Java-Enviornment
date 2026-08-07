import java.util.Arrays;

public class occurance {
    public static void main(String[] args) {
        int[] arr={7,7,7,7,9};
        int[] tar=searchrange(arr,7);
        System.out.println(Arrays.toString(tar));
    }

    static int[] searchrange(int [] arr,int target)
    {
       int[] ans= {-1,-1};
       int start = search (arr,7,true);
       int end = search(arr,7,false);
       ans[0]=start;
       ans[1]=end;
       return ans;

    }
    static int search(int [] arr,int target,boolean findindex)
    {
       int ans=-1;
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
        else 
        {
            
          
          if(findindex)
          {
          end=mid-1;
          mid = start + (end-start)/2;
          ans=mid;
          
          
           
          }
          
         
         else
         {
         start=mid+1;
         mid = start + (end-start)/2;
         ans=mid;
         return ans;
          
         }
        }
        
        
        
          
    } 
     return ans;
    }
}

