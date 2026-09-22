public class allpath {
    public static void main(String[] args) {
        boolean[][] board={{true,true,true},
                            {true,true,true},
                             {true,true,true}};
                             allpaths("",board,0,0);
    }

    static void allpaths(String p,boolean[][] mat,int r,int c)
    {
        if(r==mat.length-1&&c==mat[0].length-1)
        {
           System.out.println(p);
           return;
        }

        if(!mat[r][c])
        {
            return;
        }

        mat[r][c]=false;
        if(r<mat.length-1)
        {
            allpaths(p+'D', mat, r+1, c);
        }
        if(c<mat[0].length-1)
        {
            allpaths(p+'R',mat,r,c+1);
        }
        if(r>0)
        {
            allpaths(p+'U',mat,r-1,c);
        }
        if(c>0)
        {
            allpaths(p+'L',mat,r,c-1);
        }
        mat[r][c]=true;
    }
}
