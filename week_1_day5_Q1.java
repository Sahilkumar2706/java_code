import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int total_score;
        if(a>0 && b>0)
        {
            total_score=((a*4)+(b*6));
            System.out.print(total_score);
        }
        else
        {
            total_score=0;
            System.out.print(total_score);
        }
    }
}