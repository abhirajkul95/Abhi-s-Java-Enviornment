public class searchinrange {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int target=5;
        int ans=search(arr, target);
        System.out.println("target present at  "+ ans);

    

    }

    static int search(int[] arr,int target)
    {
        for(int i=1;i<4;i++)
        {
           if(arr[i] == target)
           {
            return i;
           }
        }
        return -1;
    }
}
