import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double g = scan.nextDouble();
        double b = scan.nextDouble();
        int rInt = (int) Math.ceil(r);
        int gInt = (int) Math.ceil(g);
        int bInt = (int) Math.ceil(b);
        System.out.println(rInt + " " + gInt + " " + bInt);
    }
}