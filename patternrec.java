public class patternrec {
    public static void main(String[] args) {
        prog(4,0);
    }

    static void prog(int row,int column)
    {
        
        if(row==0)
        {
            return;
        }
        if(column<row)
        {   
            prog(row,column+1);
            System.out.print("*");
            
        }else { 
            prog(row-1,0);
            System.out.println(" ");
                
    }
        
    }
}
