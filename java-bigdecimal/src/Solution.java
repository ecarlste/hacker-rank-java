import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write code here
        Arrays.sort(s, 0, n, Collections.reverseOrder((firstString, secondString) -> {
            BigDecimal firstBigDecimal = new BigDecimal(firstString);
            BigDecimal secondBigDecimal = new BigDecimal(secondString);
            return firstBigDecimal.compareTo(secondBigDecimal);
        }));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}