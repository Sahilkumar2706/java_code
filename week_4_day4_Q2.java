import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        String d = obj.nextLine();

        obj.close();

        String ot, ct;

        

        switch(d) {

            case "Monday":

            case "Tuesday":

            case "Wednesday":

            case "Thursday":

            case "Friday":

                ot = "8:30";

                ct = "5:30";

                break;

            case "Saturday":

                ot = "9:30";

                ct = "4:30";

                break;

            default:

                System.out.println("Library is closed");

                return;

        }

        

        System.out.println(ot + " " + ct);

    }

}