import java.util.Scanner;

public class valueBiggestinArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size not 20 element.");
        } while (size > 20);

        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();

        }
        System.out.print("array list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("value biggest in array is: " + max + " ,at position " + index);
    }
}
