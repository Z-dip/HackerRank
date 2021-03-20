import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        try {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a/b);            
        } catch (java.util.InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        } catch (java.lang.ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        finally {
            in.close();
        }        
    }
}
