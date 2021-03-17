import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;
        int sum   = 0;
       
        for(int i = 0; i < n; i++) {
        array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        System.out.println(count);
    }
}
    
