public class mazecount {
    public static void main(String[] args) {
        int count = prog(3,3);
        System.out.println(count);
    }

    static int prog(int r,int c)
    {
        if(r==1|| c==1)
        {
            return 1;
        }

        int right = prog(r-1,c);
        int left =prog(r,c-1);

        return left +right;



    }
}
