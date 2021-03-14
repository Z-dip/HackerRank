import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        
        for (int i = 0; i < size; i++) {
           int n = scanner.nextInt();
            for(int j = 2; j <= n / j; j++){
                if(n % j == 0) {
                    n = 1;
                }
            }

            if(n == 1) {
            System.out.println("Not prime");
            } else {
                System.out.println("Prime");
            }
        }
    }
}
