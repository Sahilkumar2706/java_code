import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. println output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 7) {
            int s = 0;
            int m[] = new int[num];
            for (int i = 0; i < num; i++) {
                m[i] = sc.nextInt();
                s = s + m[i];
            }
            int per = (100 * s) / (100 * num);

            if (per >= 90) {
                System.out.println("A+");
            } else if (per >= 70 && per <= 89) {
                System.out.println("A");
            } else if (per >= 60 && per <= 69) {
                System.out.println("B");
            } else if (per >= 50 && per <= 59) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }

        } else {
            System.out.println("Invalid");
        }

    }
}