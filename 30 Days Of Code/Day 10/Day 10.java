import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();      
        int max = 0;
        int temporary = 0;
        char[] bNumber = Integer.toBinaryString(n).toCharArray();
        
        for(int i = 0; i < bNumber.length; i++){
            temporary = (bNumber[i] == '0') ? 0 : temporary + 1; 
            if(temporary > max){
                max = temporary;
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
