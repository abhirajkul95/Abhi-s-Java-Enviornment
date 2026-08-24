public class checksort
{
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        System.out.println(prog(arr,0));
    }

    static boolean prog(int[] arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }

        return arr[index]<arr[index+1]&& prog( arr,index+1);
    }
}