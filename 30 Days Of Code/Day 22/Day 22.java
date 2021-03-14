import java.util.*;

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
    protected <T> void printArray(T... arr) {
        for(T x : arr) {
        System.out.println(x);
    }
}
}
