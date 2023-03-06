import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius: ");
        int radius = sc.nextInt();
        thuchanh3 circle = new thuchanh3(radius);
        circle.getRadius();
        circle.getArea();
        circle.sum();
    }
}
