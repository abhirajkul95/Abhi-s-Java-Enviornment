public class maximum {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5,6};
        int ans = max(arr);
        System.out.println("maximum number is "+ans);
    }

    static int max(int[] arr)
    {
        int maximum =arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maximum)
            {
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
