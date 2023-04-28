import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            double brr[] = new double[n];
            boolean neg = false;
            for(int i=0;i<n;i++){
                brr[i]=sc.nextDouble();
                if(brr[i]<0){
                    neg = true;
                }
            }
            if(neg==false){
                int brr2[] = new int[n];
                for(int i=0;i<n;i++){
                    brr2[i] = (int)(brr[i]); 
                }
                for(int i=0;i<n;i++){
                    System.out.println(brr2[i]);
                }
            }
            else{
                System.out.print("Invalid Array Elements");
            }
        }
        else{
            System.out.print("Invalid Array Size");
        }
    }
}