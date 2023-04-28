import java.io.*; 
import java.util.*; 
 
public class Solution { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Long accountNumber = sc.nextLong(); 
        sc.nextLine(); 
        String accountHolderName = sc.nextLine(); 
        char gender = sc.next().charAt(0); 
        int amount = sc.nextInt(); 
        int currentBalance = 20000; 
        String greetings=""; 
         
         if (gender == 'M') { 
                greetings = "Mr. "; 
            } else { 
                greetings = "Ms. "; 
            } 
         
        if (amount <= currentBalance) { 
            int newBalance = currentBalance - amount; 
            
            System.out.println("Hi " + greetings + accountHolderName + "!"); 
            System.out.println("Your Account Balance after withdrawl is " + newBalance + "."); 
        } else { 
            System.out.println("Hi " + greetings + accountHolderName + "!"); 
            System.out.println("Insufficient Funds! You can not withdraw " + amount + "."); 
        } 
    } 
}