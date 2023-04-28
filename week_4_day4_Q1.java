import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int m = obj.nextInt();

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {

            arr[i] = obj.nextInt();

        }

        obj.close();

        

        int total = 0;

        for (int i = 0; i < m; i++) {

            total += arr[i];

        }

        

        System.out.println(total);

    }

}