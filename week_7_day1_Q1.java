import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String corr = sc.next();
        int n = sc.nextInt();
        if (n > 0) {
            String str[] = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
            }

            for (int i = 0; i < str.length; i++) {
                double m = 0.00;
                for (int j = 0; j < 5; j++) {
                    if ((str[i].charAt(j) >= 'A' && str[i].charAt(j) <= 'D')
                            || (str[i].charAt(j) >= 'a' && str[i].charAt(j) <= 'd')) {
                        if ((str[i].charAt(j) == corr.charAt(j))) {
                            m = m + 1;

                        }

                        else {
                            m = m - 0.25;
                        }
                    } else {
                        m = m + 0;
                    }

                }
                System.out.print(m + " ");
            }
        } else {
            System.out.println("Incorrect Input");
        }

    }
}
