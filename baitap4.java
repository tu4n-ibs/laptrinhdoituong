import java.util.Scanner;

public class baitap4 {

    double a;
    double b;
    double c;

    public baitap4(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double delta;

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) return 0;
        return (-b + Math.pow(delta, 0.5)) / (2 * a);
    }

    public double getRoot2() {

        if (this.getDiscriminant() < 0) return 0;
        return (-b - Math.pow(delta, 0.5)) / (2 * a);
    }

}
