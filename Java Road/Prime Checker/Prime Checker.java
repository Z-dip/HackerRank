import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;


class Prime {
    public void checkPrime(int... values) {
        for (int i : values) {
            BigInteger big1 = new BigInteger(String.valueOf(i));
            if (big1.isProbablePrime(1)) {
                System.out.print(big1.intValue() + " ");
            }
        }
        System.out.println();
    }
}
public class Solution {
