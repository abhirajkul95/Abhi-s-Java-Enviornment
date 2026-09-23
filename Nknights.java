public class Nknights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board= new boolean[n][n];
        System.out.println(prog(board,0,4));

    }

    static int prog(boolean[][] board,int row,int target)
    {
        if(target==0)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count =0;
        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                count+=prog(board,row+1,target-1);
                board[row][col]=false;
            }
        }
        return count;

    
    }

    static boolean isSafe(boolean[][] board,int row,int col)
    {
        if(isvalid(board,row-2,col-1)){
            if(board[row-2][col-1])
            {
                return false;
            }
        }

        if(isvalid(board,row-2,col+1)){
            if(board[row-2][col+1])
            {
                return false;
            }
        }

        if(isvalid(board,row-1,col-2)){
            if(board[row-1][col-2])
            {
                return false;
            }
        }

        if(isvalid(board,row-1,col+2)){
            if(board[row-1][col+2])
            {
                return false;
            }
        }


        
        return true;   
    }

    static void display(boolean[][] board)
    {
      for(boolean[] row:board)
      {
        for(boolean element:row)
        {
            if(element)
            {
                System.out.print("Q ");

            }else{
                System.out.print("X ");
            }
        }
        System.out.println();
      }
    }

    static boolean isvalid(boolean[][] board,int row,int col)
    {
        if(row>=0&& row<board.length&&col>=0&& col<board.length)
        {
            return true;
        }
        return false;
    }



}




