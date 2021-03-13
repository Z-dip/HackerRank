import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i = 0; i <= n; i++) {
            String myStr = scanner.nextLine();
            String even = "";
            String odd = "";
            for (int j = 0; j < myStr.length(); j++) {
                char temp = myStr.charAt(j);
                if (j % 2 == 0) {
                    even += temp;
                } else {
                    odd += temp;
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
    
   
