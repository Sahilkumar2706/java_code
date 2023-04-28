import java.util.Scanner;

class Complex {
    private int real;
    private int imaginary;

    
    public Complex() {
        real = 0;
        imaginary = 0;
    }

    
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

   
    public Complex Mul_Complex(Complex c1, Complex c2) {
        int realPart = (c1.real * c2.real) - (c1.imaginary * c2.imaginary);
        int imaginaryPart = (c1.real * c2.imaginary) + (c1.imaginary * c2.real);
        return new Complex(realPart, imaginaryPart);
    }

    
    public void Display() {
        if (imaginary < 0) {
            System.out.println(real + "" + imaginary + "i");
        } else {
            System.out.println(real + "+" + imaginary + "i");
        }
    }
}

public class Test_Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();
        Complex c1 = new Complex(real1, imaginary1);

        
        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();
        Complex c2 = new Complex(real2, imaginary2);

       
        Complex product = new Complex().Mul_Complex(c1, c2);

        
        product.Display();
    }
}