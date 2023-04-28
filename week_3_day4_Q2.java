import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc= new Scanner(System.in);
        int money=sc.nextInt();
       
        int withdraw=money+money/10;
        double interest = withdraw/12;
        double intersett=interest+0.33f;
        System.out.println(withdraw);
        System.out.print(String.format("%.2f",intersett));
    }
}