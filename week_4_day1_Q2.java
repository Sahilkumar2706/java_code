import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[]= new int[11];
        int marks =0;
        if(n>0)
        {
            for(int i=0;i<n;i++)
            {
                arr[i]= obj.nextInt();
                marks+=arr[i];
            }
            System.out.print(marks);
        }
        
        else
        {
            System.out.print("Invalid");
        }
        
    }
}