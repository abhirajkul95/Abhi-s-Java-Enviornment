public class letters {
    public static void main(String[] args) {
        char[] arr={'a','b','c','d','j'};
        char cel=cellingmet(arr,'k');
        System.out.println("celling of array is : "+cel);        
    }

        static char cellingmet(char[] arr,char target)
    { 
        int start=0;
        int end=arr.length-1;
        int mid =start +  (end -start)/2;

        while(start<=end)
        {
            if(target>arr[mid])
            {
                start=mid+1;
                mid =start +  (end -start)/2;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
                mid =start +  (end -start)/2;
            }

            if(start>=arr.length)
            {
                return arr[0];
            }




        }
        return arr[start ];
        
    }
}
