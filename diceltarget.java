public class diceltarget {
    public static void main(String[] args) {
        prog("",4);
    }

    static void prog(String p,int target)
    {
        if(target ==0)
        {
            System.out.println(p);
            return;


        }

        for(int i=1;i<=6&&i<=target;i++)
        {
          prog(p+i,target-i);
        }
    }
}
