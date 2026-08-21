public class one_to_n {
    public static void main(String[] args) {
        revprog(5);
    }

    static void prog(int n)
    {
        
        
        
        if(n<1)
        {
            return ;
        }
        
         System.out.println(n);
         prog(n-1);
    }

    static void revprog(int n)
    {
        
        
        
        if(n<1)
        {
            return ;
        }
        
         
         revprog(n-1);
         System.out.println(n);
    }
}
