import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str[] = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.next();
        }
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < num; i++) {
            if (str[i].charAt(0) == '0' || str[i].charAt(0) == '1' || str[i].charAt(0) == '2' || str[i].charAt(0) == '3'
                    || str[i].charAt(0) == '4' || str[i].charAt(0) == '5' || str[i].charAt(0) == '6'
                    || str[i].charAt(0) == '7' || str[i].charAt(0) == '8' || str[i].charAt(0) == '9') {
                cnt1++;
            } else {
                cnt2++;
            }
        }
        System.out.println(cnt1);
        System.out.print(cnt2);
    }
}