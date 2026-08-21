public class sod {
    public static void main(String[] args) {
        int res=prog(1530);
        System.out.println(res);
    }

    static int prog(int n)
    {
       if(n==0)
       {
        return 0;
       }

        return n%10 + prog(n/10);
    }
}
