import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
        for(int i=0;i<=n;i++)
        {
            System.out.println(i);
        }
        System.out.println("Games End");
    }
    }
}