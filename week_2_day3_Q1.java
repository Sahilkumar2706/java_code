import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            double f = sc.nextDouble();
            double c = (f-32.000)*(0.555);
            System.out.println(c);
            
        }
        if(n==2){
            double c = sc.nextDouble();
            double f = (c*1.8)+32;
            System.out.printf("%.1f",f);
        }
    }
}
