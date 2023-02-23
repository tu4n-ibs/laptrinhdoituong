import java.util.Scanner;

public class ValueSmallestInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//          khoi tao mang
        int[] size = new int[10];
//         duyet va nhap gia tri cho mang
        for (int i = 0; i < size.length; i++) {
            System.out.print("enter element in array " + (i + 1) + ": ");
            size[i] = sc.nextInt();
        }

        int min = size[0];
        int index = 1;

        for (int i = 0; i < size.length; i++) {
            if (size[i] < min) {
                min = size[i];
                index = i + 1;
            }
        }
        System.out.println("value smallest in array is " + min + " ,at position: " + index);
    }
}

