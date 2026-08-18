public class fibinocci {
    public static void main(String[] args) {

        System.out.println(fib(3));
        
    }

    static int fib(int n)
    {
        int sum=0;
        if(n<=0)
        {
            return -1;
        }
        fib(n-1);
        
        sum+=n;

        return sum;
        

    }
}
