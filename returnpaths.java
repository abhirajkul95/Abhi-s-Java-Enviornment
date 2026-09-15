public class returnpaths {
    public static void main(String[] args) {
        prog("",3,3);
    }

    static void prog(String p,int r,int c)
    {
        if(r==1&&c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            prog(p+'D',r-1,c);
        }
        if(c>1)
        {
            prog(p+'R',r,c-1);
        }


    }
}
