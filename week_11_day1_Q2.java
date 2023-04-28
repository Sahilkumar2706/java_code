import java.io.*;
import java.util.*;

public class Solution {
    static class Inner_Calculator{
        void addition(int x, int y){
            System.out.println(x+y);
        }
        void subtraction(int x, int y){
            System.out.println(x-y);
        }
        void multiplication(int x, int y){
            System.out.println(x*y);
        }
        void division(int x, int y){
            System.out.println(x/y);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        char op=sc.next().charAt(0);
        if(num1>0 && num2>0){
            Inner_Calculator in1 = new Inner_Calculator();
            switch(op){
            case '+':{
                in1.addition(num1, num2);
                break;
            }
            case '-':{
                in1.subtraction(num1, num2);
                break;
            }
            case '*':{
                in1.multiplication(num1, num2);
                break;
            }
            case '/':{
                in1.division(num1, num2);
                break;
            }
            default:{
                System.out.println("invalid operator");
            }
        }
        }
        else{
            System.out.print("invalid input");
        }
        
        }
}