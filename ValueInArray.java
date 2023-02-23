import java.util.Scanner;

public class ValueInArray {
    public static void main(String[] args) {
        String[] student = {" tu anh", "tuan anh", "vinh", "nam", "tuan"};
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a name student: ");
        String nameStudent = sc.nextLine();
        boolean is_student = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(nameStudent)) {
                System.out.println("position of the student " + nameStudent + " is: " + i);
                is_student = true;
                break;
            }
        }
        if (!is_student) {
            System.out.println(" not found " + nameStudent + " in the list");
        }
    }
}