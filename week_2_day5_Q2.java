import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        if (input >= 0) {
            int output = (int) input;
            System.out.println(output);
        } else {
            System.out.println("Invalid Input");
        }
    }
}