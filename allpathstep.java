import java.util.Arrays;

public class allpathstep {
        public static void main(String[] args) {
        boolean[][] board={{true,true,true},
                            {true,true,true},
                             {true,true,true}};
        int[][] path=new int[board.length][board[0].length];
                             allpaths("",board,0,0,path,1);
    }

    static void allpaths(String p,boolean[][] mat,int r,int c,int[][] path,int step)
    {
        
        if(r==mat.length-1&&c==mat[0].length-1)
        {
            path[r][c]=step;
           for(int[] arr: path)
           {
            System.out.println(Arrays.toString(arr));
           }
           System.out.println(p);
           System.out.println();
           return;
        }

        if(!mat[r][c])
        {
            return;
        }

        mat[r][c]=false;
        path[r][c]=step;
        
        if(r<mat.length-1)
        {
            allpaths(p+'D', mat, r+1, c,path,step+1);
        }
        if(c<mat[0].length-1)
        {
            allpaths(p+'R',mat,r,c+1,path,step+1);
        }
        if(r>0)
        {
            allpaths(p+'U',mat,r-1,c,path,step+1);
        }
        if(c>0)
        {
            allpaths(p+'L',mat,r,c-1,path,step+1);
        }
        mat[r][c]=true;
        path[r][c]=0;
    }
}
