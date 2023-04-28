import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Stack<Character> st1 = new Stack<Character>();
        for(int i=0;i<2;i++){
            st1.push(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            st1.push(s2.charAt(i));
        }
        for(int i=2;i<s1.length();i++){
            st1.push(s1.charAt(i));
        }
        for(char ch: st1){
            System.out.print(ch);
        }
    }
}