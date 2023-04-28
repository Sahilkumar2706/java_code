import java.io.*;
import java.util.*;

class Person {
    int age;
}

interface test {
    void find(Person p[]);
}

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] p = new Person[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Person();
            p[i].age = sc.nextInt();
        }

        test t = (per) -> {
            int cnt = 0;
            for (int i = 0; i < per.length; i++) {
                if (per[i].age > 25) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        };
        sc.close();
        t.find(p);

    }
}