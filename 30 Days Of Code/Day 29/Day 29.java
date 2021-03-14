import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
            int res = 0;
            
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j <= n; j++) {
                    int and = i & j;
                    if(and < k && and > res) {
                        res = and;
                    }
                }
            }
           System.out.println(res);
        }  
            scanner.close(); 
    }
}
        
