import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class students{
    String name="null";
    int reg_no = 0;
    void getValue(String n, int reg){
        name = n;
        reg_no=reg;
    }
    void display(){
        System.out.print(name+","+reg_no);
    }
    
}


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            String name = sc.next();
            int reg = sc.nextInt();
            students s = new students();
            s.getValue(name,reg);
            s.display();
        }
        if(n==2){
            students s = new students();
            s.display();
        }
        
    }
}
