import java.util.Scanner;
public class infinitearraysearch {
    public static void main(String[] args) {

        int[] arr=new int[100];
        Scanner input= new Scanner(System.in);
        System.out.println("please enter an array :");
        for(int i=0;i<5;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("please enter target:");
        int tar= input.nextInt();
        input.close();
        int ans= search(arr,tar);
        System.out.println(ans);
        
    }

    static int search(int[] arr,int target)
    {
       int start=0;
       int end=target+1;
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
