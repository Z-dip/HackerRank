import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int d,q,x,y;
    ArrayList[] set = new ArrayList[n];
    
    for(int i=0; i < n; i++) {
        d = scanner.nextInt();
        set[i] = new ArrayList();
        for(int j = 0; j < d; j++){  
            set[i].add(scanner.nextInt());                
        }
    }
    q = scanner.nextInt();
    for(int i = 0;i < q; i++) {
        x=scanner.nextInt();
        y=scanner.nextInt();
        try {
            System.out.println(set[x-1].get(y-1));
        } catch(Exception e){
            System.out.println("ERROR!");
        }
    }
    }
}
