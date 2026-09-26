public class sudoku {
    public static void main(String[] args) {
    int[][] board = {
            {7, 8, 0, 4, 0, 0, 1, 2, 0},
            {6, 0, 0, 0, 7, 5, 0, 0, 9},
            {0, 0, 0, 6, 0, 1, 0, 7, 8},
            {0, 0, 7, 0, 4, 0, 2, 6, 0},
            {0, 0, 1, 0, 5, 0, 9, 3, 0},
            {9, 0, 4, 0, 6, 0, 0, 0, 5},
            {0, 7, 0, 3, 0, 0, 0, 1, 2},
            {1, 2, 0, 0, 0, 7, 4, 0, 0},
            {0, 4, 9, 2, 0, 6, 0, 0, 7}
        };

        if(solve(board))
        {
            display(board);
        }else{
            System.out.println("cannot solve it");
        }

    }


    static boolean solve(int [][] board)
    {
       int n=board.length;
       int row =-1;
       int col=-1;

       boolean emptyleft=true;

       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(board[i][j]==0)
            {
                row=i;
                col=j;
                emptyleft=false;
                break;
            }
        }
       

       if(emptyleft==false)
       {
          break;
       }
    }

       if(emptyleft==true)
       {
        return true;
       }
    

       for(int num=1;num<=9;num++)
       {
        if(isSafe(board, col, row, num))
        {
            board[row][col]=num;
            if(solve(board))
            {
                return true;
            }else {
                board[row][col]=0;
            }
        }
       }
       return false;
    }

    static void display(int[][] board)
    {
        for(int[] row:board)
        {
            for(int num:row)
            {
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int [][] board,int col,int row,int num)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==num)
            {
                return false;
            }
        }

        for(int [] nums:board)
        {
            if(nums[col]==num)
            {
                return false;
            }
        }

        int rowstart=row-row%3;
        int colstart=col-col%3;

        for(int r=rowstart;r<rowstart+3;r++)
        {
            for(int c=colstart;c<colstart+3;c++)
            {
                if(board[r][c]==num)
                {
                    return false;
                }
            }
        }

        return true;


    }
}
