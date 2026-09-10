import java.util.ArrayList;

public class phonekeylist{
    public static void main(String[] args) {
        ArrayList<String> ans =new ArrayList<>();
        ans=prog("","12");
        System.out.println(ans);
    }

    static ArrayList<String> prog(String p,String up)
    {
      if(up.isEmpty())
      {
        ArrayList<String> list = new ArrayList<>();
        
        list.add(p);

        return list;
      }
       ArrayList<String> ans = new ArrayList<>();
       int digit=up.charAt(0)-'0';
      for(int i= (digit-1)*3; i<digit*3;i++)
      {
        char ch =(char)('a'+i);
       ans.addAll(prog(p+ch,up.substring(1)));
      }
      return ans;
    }
}
