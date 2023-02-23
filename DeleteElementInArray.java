import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
//        tao mang
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
//         hien thi mang
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf(numbers[i] + " ");
        }
//        nhap so can xoa
        System.out.println("enter element need delete in array: ");
        int X = sc.nextInt();
        int index = 0;
//kiem tra phan tu o vi tri
        for (int i = 0; i < numbers.length; i++) {
            if (X == numbers[i]) {
                index = i + 1;
                System.out.println("location of element in array: " + index);
            }
        }

        for (int j = 0; j < numbers.length; j++) {
            if (X == numbers[j]) {
                continue;
            }
            System.out.print(" " + numbers[j]);
        }
    }
}
