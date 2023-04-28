import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class employee {
    int id;
    int age;

    employee(int i, int a) {
        id = i;
        age = a;
    }

    void display() {
        System.out.println(id + " " + age);

    }

}

public class Solution {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n>=1 && n<=10){
            
        
        employee e[] = new employee[n];
        int min = 0;
        for (int i = 0; i < n; i++) {
            int id = obj.nextInt();
            int a = obj.nextInt();
            if((id>=10 && id<=1000) && (a>=18 && a<=50)){
                e[i] = new employee(id, a);
                if (a < 30) {
                    min = i;
                }
            }
            else{
                System.out.print("Invalid data");
            }
            
        }

        e[min].display();
        }
        else{
            System.out.print("Invalid input");
        }
    }
} 