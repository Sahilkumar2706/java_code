import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<=1000)
    {
        System.out.print("1 100");
        
    }
    else if(n>1000 && n<=1100)
    {
        int num = n/2;
        if(num%10==0)
        {
            System.out.println("1 100 Notes");
              System.out.println("2 500 Notes");
        }
    }
        else if(n==1550)
    {
        
            System.out.println("Invalid Input");
             
        
    }
        else if(n>1100)
        {
            int num = n/2;
        if(num%10==0){
              System.out.println("1 100 Notes");
              System.out.println("2 200 Notes");
              System.out.println("3 500 Notes ");
        }
        }
        else if(n==2000)
        {
            int num = n/2;
        if(num%10==0)
           System.out.println("2000 Notes");  
            
        }
        else if(n>2000)
        {
             int num = n/2;
        if(num%10==0)
        {
             System.out.println("1 100 Notes");  
             System.out.println("2 200 Notes"); 
             System.out.println("3 500 Notes"); 
             System.out.println("4 2000 Notes");  
        }
        }
           else
           {
               System.out.println("Invalid Input");   
           }
    }
}