import java.util.Scanner;

public class studentTest {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.print("enter a size: ");
            size = sc.nextInt();
            if (size>30){
                System.out.print("size should not 30");
            }
        }while (size>30);
        array = new int[size];
        int i=0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        int index =0;
        System.out.printf("list of mark: ");
        for (int j=0; j<array.length;j++){
            System.out.println(array[j]);
            if (array[j] >=5 && array[j]<=10){
               index++;
            }
        }System.out.printf(" the number of student passing exam " + index );
    }
}
