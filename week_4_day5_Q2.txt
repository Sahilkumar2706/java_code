import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        String a[] = new String[4];
        String b[] = new String[4];
        for(int i=0;i<4;i++){
            a[i] = obj.next();
        }
        for(int i=0;i<4;i++){
            b[i] = obj.next();
        }
        int num=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(a[i].equals(b[j])){
                    num++;
                }
            }
        }
        System.out.print(num);
        
        
    }
}