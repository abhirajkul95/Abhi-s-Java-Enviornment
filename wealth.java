public class wealth {

    public static void main(String[] args) {

        int[][] accounts ={{1,2,3},{3,2,1}};
        int answer=rich(accounts);
        System.out.print(answer);

        

    }

    static int rich(int[][] accounts)
    {
        int ans = Integer.MIN_VALUE;
        for(int person=0; person<accounts.length;person++)
        { 
            int sum =0;
            for(int account=0; account<accounts[person].length;account++)
            {
                sum += accounts[person][account];
            }
            if(sum>ans)
                ans=sum;
        }

        return ans;
        
    }
    
}
