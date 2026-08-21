public class pod {
    public static void main(String[] args) {
        int res=prod(125);
        System.out.println(res);
    }

    static int prod(int n)
    {
        if(n<=1)
        {
          return 1;
        }

        return n%10 * prod(n/10);
    }
}
