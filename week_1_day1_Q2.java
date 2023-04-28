import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       float a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        float result;
        float d=3;
        if(a>1&&a<1000&&b>1&&b<1000&&c>1&&c<1000)
        {
         result=((a+b+c)/d);
            result-=0.055;
           String value = String.format("%.1f", result);
            System.out.println(value);
        }
  
       
    }
}