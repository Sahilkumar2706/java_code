import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i=0;i<=m;i++)
        {
            for(int j=1;j<=(m-i);j++)
            {
                System.out.print(""+j+" ");
            }
            System.out.println("");
        }
    }
}