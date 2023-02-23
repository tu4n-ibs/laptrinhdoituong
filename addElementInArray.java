import java.util.Scanner;

public class addElementInArray {
    public static void main(String[] args) {
// tạo mảng
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
// nhap so chen và vi tri chen
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number need add: ");
        int number = sc.nextInt();
        System.out.println("location need add: ");
        int location = sc.nextInt();
        int index = 0;

        if (index<= -1 || index>= array.length -1){
            System.out.println(" you can't");
        }
//hien mang ban dau
        System.out.print("array before add: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 9; i >= location; i--) {
            array[i - 1] = array[i];
        }
        array[location] = number;
//hien mang sau khi them
        System.out.print("   array after add: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
