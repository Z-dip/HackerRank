import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Add {
    
    protected void add(int... intArgs) {
        int sum = 0;
        String separator = "";
        for (int i : intArgs) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";            
        }
        System.out.println("=" + sum);
    }
}

