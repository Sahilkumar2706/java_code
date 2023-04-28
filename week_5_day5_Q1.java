import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        double a[][] = new double[row][];
        
        for(int i=0;i<row;i++){
            int C = obj.nextInt();
            a[i] = new double[C];
            for(int j=0;j<C;j++){
                a[i][j] = obj.nextDouble();
            }
        }
        int num = obj.nextInt();
        double sum = 0;
        for(int i=0;i<a[num-1].length;i++){
            sum = sum+ a[num-1][i];
        }
        double Total = sum/a[num-1].length;
        System.out.print("Average in Subject-"+num+" is "+ Total);
        
        
        
        
    }
}