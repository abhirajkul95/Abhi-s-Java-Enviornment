public class linearwithrec {
    public static void main(String[] args) {
        int [] arr={4,7,22,78,89};
        System.out.println(linear(arr,0,89));
    }

    static int linear(int[] arr,int index,int target)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(target==arr[index])
        {
            return index;
        } 

        
      return linear(arr,index+1,target);
    }
}
