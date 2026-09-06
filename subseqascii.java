public class subseqascii {
   public static void main(String[] args) {
            prog("","abc");
   }

       static void prog(String processed,String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
           System.out.println(processed);
           return;
        }

        char ch = unprocessed.charAt(0);

        prog(processed+ch,unprocessed.substring(1));
        prog(processed,unprocessed.substring(1));
        prog(processed+(ch+0),unprocessed.substring(1));
    }
}
