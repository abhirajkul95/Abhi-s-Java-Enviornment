public class evennumbers {
    public static void main(String[] args) {
        int[] arr={12,2344,34,534,543,};
        System.out.println(findnumb(arr));
    }

    static int findnumb(int[] arr)
    {
        int count =0;
        for(int num: arr)
        {
            if(iseven(num))
            {
                count++;
            }
        }
        return count;

    }

    static int dig(int num)
    {
       int count=0;
       while(num>0)
       {
         
        
         count++;
         num =num/10;
       }
       return count;
    }

    static boolean iseven(int num)
    {
       int number = dig(num);
       return number % 2 ==0;
    }
}
