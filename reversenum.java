public class reversenum
{
     static int sum=0;
    
    static void prog(int n)
    {
        
        if(n==0)
        {
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        prog(n/10);
        
    }
    public static void main(String[] args) {

       
        prog(1234);
        System.out.println(sum);
        

        
    }
     

}