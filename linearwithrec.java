public class linearwithrec {
    public static void main(String[] args) {
        int [] arr={4,7,22,78,89};
        System.out.println(linear(arr,0,78));
    }

    static int linear(int[] arr,int index,int target)
    {
        if(target==arr[index])
        {
            return index;
        } 
        if(target!=arr[index])
        {
            return -1;
        }
        
      return linear(arr,index+1,target);
    }
}
