import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> list = new ArrayList(N);
        
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
    
        int Q = scanner.nextInt();
        
        for (int i = 0; i < Q; i++) {
                       
            if (scanner.next().equals("Insert")) {
                list.add(scanner.nextInt(), scanner.nextInt());
            } else {
                list.remove(scanner.nextInt());
            }
        }
        scanner.close();
        
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
