import java.io.*; 
import java.util.*; 
import java.util.Scanner; 
 
public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String input = sc.nextLine(); 
        String numberString = input.substring(input.indexOf(":") + 2); 
        int number = Integer.parseInt(numberString); 
        int j=number; 
        if (number < 10 || number > 99) { 
            System.out.println("Invalid Input"); 
        } else { 
            int sum = 0; 
            int product = 1; 
            while (number > 0) { 
                int digit = number % 10; 
                sum += digit; 
                product *= digit; 
                number /= 10; 
            } 
         
            if (sum + product == j) { 
               
                System.out.println("Special two digit number"); 
            } else { 
                System.out.println("Not a special two digit number"); 
            } 
        } 
    } 
}