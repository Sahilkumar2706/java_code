import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        boolean cube=false;
        for(int i=1;i<=N/2;i++){
            if((i*i*i) == N){
                cube = true;
                break;
            }
        }
        System.out.println((cube) ? "Perfect Cube" : "Not Perfect Cube");
    }
}