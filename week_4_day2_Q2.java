import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        if(m>0 && m<=5){
            while(m!=0){
                int l=7;
                int sum = 0;
                for(int i=0;i<l;i++){
                    int n = sc.nextInt();
                    sum = sum+n;
                }
                if(sum == 56){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
                m--;
            }
        }
    }
}