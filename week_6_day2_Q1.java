import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class integer1
{
    int n,l,k;
    int sum=0;
    int mul=1;
    int summ()
    {
        sum= sum+l;
        return sum;
    }
    
    int multiple()
    {
         mul=mul*l;
        return mul;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        integer1 obj = new integer1();
        Scanner sc = new Scanner(System.in);
        obj.n= sc.nextInt();
        if(obj.n>0)
        {
            int arr[]= new int[obj.n];
            for(int i=0; i<obj.n;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            int choice= sc.nextInt();
            if(choice==1)
            {
               for(int i=0;i<obj.n;i++)
               {
                   obj.l=arr[i];
                   obj.k= obj.summ();
               }
                System.out.print(obj.k);
            }
            else if(choice==2)
            {
                for(int i=0;i<obj.n;i++)
               {
                   obj.l=arr[i];
                   obj.k= obj.multiple();
               }
                System.out.print(obj.k);
            }
            
            else
            {
                System.out.print("Wrong Choice");
            }
            }
        
        else{
            System.out.print("Invalid Array Size");
        }
        }
            
    }
