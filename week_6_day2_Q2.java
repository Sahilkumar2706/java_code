import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


    class checkk{
    int p,b;
        boolean check(int n){
        if(n%2==0 && n%3==0)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    }
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        checkk ch=new checkk();
        Scanner sc= new Scanner(System.in);
        ch.p =sc.nextInt();
        if(ch.p>20 && ch.p<400)
        {
        boolean result= ch.check(ch.p);
            if(result){
            
            System.out.print("True");
            }
            else{
                System.out.print("False");
            }
    }
        else{
            System.out.print("Invalid Input");
        }
}
}