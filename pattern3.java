public class pattern3 {
        public static void main(String[] args) {
        int n=4;
        pattern(n);
    }

    static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
