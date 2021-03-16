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

        //Write your code here
        Arrays.sort(s, (a , b) -> {

        if (a == null || b == null) {

       return 0;

        } else {

        BigDecimal ad=new BigDecimal(a);

        BigDecimal bd=new BigDecimal(b);
         return bd.compareTo(ad);
        }
    });
        //Output
