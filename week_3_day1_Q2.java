import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int total_amount = a*10/100+a;
      
        System.out.println(total_amount);
       float emi = total_amount/12f;
        System.out.printf("%.2f",emi);
    }
}