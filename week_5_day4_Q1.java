import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int factorial=1;
        Scanner sc=new Scanner(System.in) ;
        int n= sc.nextInt() ;
        for(int i=1;i<=n;i++)
            {
        
            factorial= factorial*i;
            }
        System.out.println(factorial);
    }
}
