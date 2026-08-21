public class facto
{
  public static void main(String[] args) {
    int res=prog(5);
    System.out.println(res);
  }

  static int prog(int n)
  {
    
    if(n<=1)
    {
      return 1;
    }
    return n*prog(n-1);
    
    

  }
}