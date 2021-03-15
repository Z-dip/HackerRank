import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char chA[] = a.toLowerCase().toCharArray();
        char chB[] = b.toLowerCase().toCharArray();
        
        if(a.length() == b.length()) {
            java.util.Arrays.sort(chA);
            java.util.Arrays.sort(chB);
        }
        return java.util.Arrays.equals(chA, chB);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
