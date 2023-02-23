import java.util.Arrays;
import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        int []array1 = new int[5];
        int []array2 = new int[5];
        int length = array1.length + array2.length;
        int []array3= new int[length];
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i<array1.length){
            System.out.printf("enter number array1 " + (i+1)+ ": ");
            array1[i]= sc.nextInt();
            i++;
        }
        int j = 0;
        while (j<array2.length){
            System.out.printf("enter number array2 " + (j+1)+ ": ");
            array2[j]= sc.nextInt();
            j++;
        }

        int index =0;
        for (int a:array1) {
            array3[index]=a;
            index++;
        }
        for (int b:array2) {
            array3[index]=b;
            index++;
        }
        System.out.println("when array graft: ");
            System.out.print( Arrays.toString(array3));
    }
}
