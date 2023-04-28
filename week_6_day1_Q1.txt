import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class prime
{
    int num ;
    
    void result()
    {
        for(int i=2;i<=num;i++)
        {
            while(num%i==0)
            {
                System.out.print(i+ " ");
                num=num/i;
            }
        }
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        prime p= new prime();
        Scanner sc= new Scanner(System.in);
        p.num=sc.nextInt();
        if(p.num>=10 && p.num<=50)
        {
         p.result();
      
        }
        else
        {
            System.out.print("Invalid");
        }
        
        
    }
}