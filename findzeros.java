public class findzeros {
    public static void main(String[] args) {
        prog(30204);
        System.out.println(count);
        
    }

    static int count=0;
    static void prog(int num)
    {
        if(num==0)
        {
            return;
        }
        int rem=num%10;
        if(rem==0)
        {
            count++;
        }
        num=num/10;
        prog(num);
    }
}
