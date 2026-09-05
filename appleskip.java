public class appleskip {
    public static void main(String[] args) {
        skip("iluvapplevaidehi","");
    }

    static void skip(String a,String b)
    {
        if(a.isEmpty())
        {
            System.out.println(b);
            return;
        }

        if(a.startsWith("apple"))
        {
          skip(a.substring(5),b);
        }else {
            skip(a.substring(1),b+a.charAt(0));
        }
    }
}
