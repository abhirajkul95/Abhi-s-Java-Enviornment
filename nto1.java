public class nto1 {
    public static void main(String[] args) {
        prog(5);
    }

    static int prog(int n)
    {
        
        
        System.out.println(n);
        if(n<=1)
        {
            return -1;
        }
        

        return prog(n-1);
    }
}
