public class skipa {
    public static void main(String[] args) {
        skip("abhiraj","");
    }

    static void skip(String a,String b)
    {
        if(a.isEmpty())
        {
            System.out.println(b);
            return;
        }
        char ch= a.charAt(0);

        if(ch=='a')
        {
            skip(a.substring(1),b);
        } else{
            skip(a.substring(1),b+ch);
        }
    }
}
