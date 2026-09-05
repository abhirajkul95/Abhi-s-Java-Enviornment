public class subseqascii {
   public static void main(String[] args) {
            prog("","abc");
   }

       static void prog(String p,String up)
    {
        if(up.isEmpty())
        {
           System.out.println(p);
           return;
        }

        char ch = up.charAt(0);

        prog(p+ch,up.substring(1));
        prog(p,up.substring(1));
        prog(p+(ch+0),up.substring(1));
    }
}
