import java.util.ArrayList;

public class diagonalmaze {
    public static void main(String[] args) {
        System.out.println(prog("",3,3));
    }

    static ArrayList<String> prog(String p,int r,int c)
    {
        if(r==1&&c==1)
        {
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(r>1&&c>1)
        {
            ans.addAll(prog(p+'D',r-1,c-1));
        }

        if(r>1)
        {
            ans.addAll(prog(p+'H',r-1,c));
        }
        if(c>1)
        {
            ans.addAll(prog(p+"V",r,c-1));
        }
        return ans;
    }
}
