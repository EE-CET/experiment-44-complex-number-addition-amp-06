import java.util.Scanner;

class Complex
{
    int real;
    int imag;

    Complex(int r, int i)
    {
        real = r;
        imag = i;
    }

    Complex add(Complex c)
    {
        int r = this.real + c.real;
        int i = this.imag + c.imag;
        return new Complex(r, i);
    }

    void print()
    {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexAddition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex sum = c1.add(c2);
        sum.print();
    }
}
