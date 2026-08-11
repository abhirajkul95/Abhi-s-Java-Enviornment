import java.util.Arrays;
public class searchin2d {
    public static void main(String[] args) {

        int[][] arr={{2,4,6,8,10},
                   {12,14,16,18,20},
                   {22,24,26,28,30},
                   {32,34,36,38,40}};

        int[] ans =search(arr,28);
        System.out.println(Arrays.toString(ans));
                  
        
    }

    static int[] search(int[][] arr,int target)
    {
        int r=0;
        int c=arr.length-1;

        while(r<arr.length && c>=0)
        {
           if(target==arr[r][c])
           {
            return new int[]{r,c};
           }
           else if(target<arr[r][c])
           {
            c--;
           }
           else r++;
        }
        return new int[] {-1,-1};
    }
}
