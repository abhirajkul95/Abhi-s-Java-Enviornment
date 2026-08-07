import java.util.Arrays;
public class suminarrays {
    public static void main(String[] args) {
       int[] arr={4,5,6};
       
       int[] result = twoSum(arr,10);
       System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {

        int[] ans={-1,-1};

        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target && i!=j)
                {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
        
    }
}
