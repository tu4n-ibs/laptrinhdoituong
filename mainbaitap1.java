import java.util.Scanner;

public class mainbaitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter width: ");
        int width = sc.nextInt();
        System.out.println("enter height: ");
        int height = sc.nextInt();
        thuchanh1 baitap1 = new thuchanh1(width, height);
        System.out.println("Area: " + baitap1.getArea());
        System.out.println("perimeter: " + baitap1.getPerimeter());

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
