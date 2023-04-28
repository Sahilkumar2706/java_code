import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int held = sc.nextInt();
        int att = sc.nextInt();
        int p = (100*att)/held;
        System.out.println((p>=75) ? p+"\nYes" : p+"\nNo");
    }
}
