import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int balance = 20000;
        long ac = sc.nextLong();
        sc.nextLine();
        String name = sc.nextLine();
        char g = sc.next().charAt(0);
        int amount = sc.nextInt();
        
        if(amount<=balance){
            balance = balance - amount;
            if(g=='M'){
                System.out.println("Hi Mr. "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+balance+".");
                
            }
            if(g=='F'){
                System.out.println("Hi Ms. "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+balance+".");
                
            }
        }
        else{
            if(g=='M'){
                System.out.println("Hi Mr. "+name+"!");
                System.out.println("Insufficient Funds! You can not withdraw "+amount+".");
                
            }
            if(g=='F'){
                System.out.println("Hi Ms. "+name+"!");
                System.out.println("Insufficient Funds! You can not withdraw "+amount+".");
                
            }
            
            
        }
        
    }
}