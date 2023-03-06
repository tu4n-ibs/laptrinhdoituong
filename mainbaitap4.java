import java.util.Scanner;

public class mainbaitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a = sc.nextDouble();
        System.out.println("nhap b: ");
        double b = sc.nextDouble();
        System.out.println("nhap c: ");
        double c = sc.nextDouble();
        baitap4 mainbaitap4 = new baitap4(a, b, c);
        if (mainbaitap4.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (mainbaitap4.getDiscriminant() == 0) {
            System.out.println("The equation has one roots " + mainbaitap4.getRoot1());
        } else {
            System.out.println("The equation has two roots");
            System.out.println("delta " + mainbaitap4.getDiscriminant());
            System.out.println("Root1: " + mainbaitap4.getRoot1());
            System.out.println("Root: " + mainbaitap4.getRoot2());
        }
    }
}
