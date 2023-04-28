import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class student{
    String name,name1;
    
    void display_name(){
        System.out.println(name);
    }
    void display_name1(){
        System.out.println(name1);
    }
    
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        student s = new student();
        if(s1.charAt(0)>='A' && s1.charAt(0)<='z'){
            s.name=s1;
            s.display_name();
        }
        else{
            System.out.print("Unknown");
        }
        if(s2.charAt(0)>='A' && s2.charAt(0)<='z'){
            s.name1=s2;
            s.display_name1();
        }
        else{
            System.out.print("Unknown");
        }
        
        
        
    }
}