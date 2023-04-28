import java.io.*;
import java.util.*;

public class Solution {
    public static int findOcc(String para, String w, int n) {
    int cnt = 0;
    int indx = -1;
    int indx2 = 0;
    while (cnt < n) {
        indx2=indx;
        indx = para.indexOf(w, indx + 1);
        
        cnt++;
    }
        if(indx==indx2){
            return indx2;
        }
    return indx;
}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.next();
        int n = sc.nextInt();
        if(n>0){
        int occ = findOcc(str,word,n);         
            System.out.println((occ<0)?"Not Present": occ);
        }
    
      
        
        else{
            System.out.print("Incorrect Input");
        }
    }
}
