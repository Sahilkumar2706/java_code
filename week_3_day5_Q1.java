import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        float present = sc.nextFloat();
        int n = sc.nextInt();
       
        if(n==1)
        {
             float value = sc.nextFloat();
            if(value>present)
            {
                System.out.print("Error");
            }
            else
            {
                float total = present- value;
                System.out.printf("%.2f",total);
            }
        }
        
        else if(n==2)
        {
            float value2 = sc.nextFloat();
            float totall = present+value2 ;
           
            System.out.printf("%.2f",totall);
        }
        else if(n==3)
        {
            System.out.print(present);
        }
        else
        {
            System.out.print("Error");
        }
    }
}