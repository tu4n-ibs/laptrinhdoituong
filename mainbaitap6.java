import java.util.Scanner;

public class mainbaitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter speed: ");
        int numberSpeed = sc.nextInt();
        baitap6 fan1 = new baitap6(numberSpeed, true, 10, " yellow ");
        baitap6 fan2 = new baitap6(2, false, 5, " blue ");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
