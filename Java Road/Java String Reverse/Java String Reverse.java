import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb = new StringBuilder(A);
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.equals(sb.reverse().toString()) ? "Yes" : "No");
        
    }
}



