
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class employee{
    int emp_id;
    String name;
    String desig;
    int sal=0;
    
    public employee(int id, String n, String des){
        emp_id = id;
        name = n;
        desig=des;
    }
    void display(){
        System.out.print(name+emp_id+sal);
    }
}


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        String des = sc.next();
        employee e = new employee(id,name,des);
        if(id>201){
            e.sal=1000;
            e.display();
        }
        else{
            System.out.print("No Appraisal");
        }
    }
}