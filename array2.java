import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[][]demo = {
                {1,2,3,4,5},
                {7,8,9,10,11},
                {6,12,13,14}
        };

        int max = demo[0][0];

        for (int i =0; i< demo.length; i++){
            for (int j = 0; j < demo[i].length; j++) {
                if (demo[i][j] > max) {
                    max = demo[i][j];
                }
            }
            System.out.println("value biggest in array is: " + max);
        }
    }
}
