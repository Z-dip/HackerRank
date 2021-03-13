//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneCatalog = new HashMap();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneCatalog.put(name , phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (!phoneCatalog.containsKey(s)) {
                System.out.println("Not found");
            } else {
            System.out.println(s + "=" + phoneCatalog.get(s));
            }
        }
        in.close();
    }
}
