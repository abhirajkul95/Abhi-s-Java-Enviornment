import java.util.ArrayList;
import java.util.List;

public class missing {
    public  void main(String[] args) {
        int[] arr={3,2,1,4,9,6,8,7};
        
        System.out.println(num(arr));
        
    }

    public  List<Integer> num(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct= arr[i]-1;
            if(arr[i]<arr.length&&arr[i]!=arr[correct])
            {
               swap(arr,correct,i);
        
            }else
            {i++;}
        }
        List<Integer> ans= new ArrayList<>();
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
             ans.add(index+1);
            }
            
        }
        return ans;
    }

        static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
