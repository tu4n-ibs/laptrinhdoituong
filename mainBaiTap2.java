import java.util.Scanner;

public class mainBaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter: ");
        double enter = sc.nextDouble();
        baitap2 mainBaiTap2 = new baitap2(enter);
        mainBaiTap2.getC();
        mainBaiTap2.getmain();
        mainBaiTap2.getmain2();
    }

}
