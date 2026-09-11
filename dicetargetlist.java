import java.util.ArrayList;

public class dicetargetlist {
    public static void main(String[] args) {
        ArrayList<String> ans = prog("",4);
        System.out.println(ans);
    }

    static ArrayList<String> prog(String p,int target)
    {
        if(target ==0)
        { 
            ArrayList<String> list = new ArrayList<>();
            
            list.add(p);

            return list;


        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++)
        {
          ans.addAll(prog(p+i,target-i));
        }
        return ans;
    }
}
