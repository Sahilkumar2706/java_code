import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int factorial =1;
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        if(n==1)
        {
            if(num%2==0)
            {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
            
        }
         else if(n==2)
        {
            if(num%2!=0)
            {
                System.out.print("YES");
            }
             else
            {
                System.out.print("NO");
            }
        }
       else if(n==3)
        {
            for(int i=2;i<=(num-1);i++)
            {
                if(num%i==0){
                    System.out.print("YES");
                } 
                else
            {
                System.out.print("NO");
            }
            }
        }
        else
        {
            for(int i=1;i<=num;i++)
            {
                factorial = factorial*i;
                
            }
            System.out.print(factorial);
        }
        
        
    }
    
}