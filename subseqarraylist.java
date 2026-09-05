import java.util.ArrayList;
public class subseqarraylist {
    public static void main(String[] args) {
        
        System.out.println(prog("","abc"));
    }

    static ArrayList<String> prog(String p,String up)
    {
        
        if(up.isEmpty())
        {
           ArrayList<String> subseq = new ArrayList<>();
           subseq.add(p);
           return subseq;
        }

        char ch = up.charAt(0);

        ArrayList<String> left=prog(p+ch,up.substring(1));
        ArrayList<String> right=prog(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
