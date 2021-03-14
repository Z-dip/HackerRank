import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */       
        Scanner scanner = new Scanner(System.in);
        
        int returnDay = scanner.nextInt();
        int returnMonth = scanner.nextInt();
        int returnYear = scanner.nextInt();
        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();
        int fine = 0;
        
        if(returnYear <= dueYear) {
            if(returnMonth <= dueMonth) {
                if(returnDay <= dueDay) {
                } else { 
                    fine = (returnDay - dueDay) * 15;
                }
            } else {
                fine = (returnMonth - dueMonth) * 500;
            }
        } else {
            fine = 10000;
        }
        
        System.out.println(fine);
        scanner.close();
    }
}
