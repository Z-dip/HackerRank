import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */       
        Scanner scanner = new Scanner(System.in);
        
        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();
        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();
        int fine = 0;
        
        if (actualYear > expectedYear) {
            fine = 10000;
        } else if (actualMonth > expectedMonth && (actualYear >= expectedYear)) {
            fine = 500 * (actualMonth - expectedMonth);
        } else if (actualDay > expectedDay && (actualMonth >= expectedMonth) &&(actualYear >= expectedYear)) {
            fine = 15 * (actualDay - expectedDay);
        }
        System.out.println(fine);

        scanner.close();
    }
}
