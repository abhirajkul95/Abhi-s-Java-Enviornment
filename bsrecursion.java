public  class bsrecursion{
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9};
        System.out.println(bs(arr,10,0,arr.length-1));
    }

    static int  bs(int[] arr,int target,int start,int end)
    {

      int  mid=start+(end-start)/2;

      if(start>end)
      {
        return -1;
      }

      if(target>arr[mid])
      {
        return bs(arr,target,mid+1,end) ;
      }
      else if(target<arr[mid])
      {
        return bs(arr,target,start,mid-1);
      }
      else return mid;
    }
}
