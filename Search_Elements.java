import java.util.Scanner;

public class Search_Elements {
    public static void main(String[] args) {
        String[] students = {"son", "anh", "hoang", "hung", "thin", "hieu", "linh", "thang", "long", "huan"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name student:");
        String input_name = input.nextLine();
        int size = students.length;
        System.out.println(searchByElement(students, input_name, size) + " in the list");
        // Cách 1 :
//        boolean isExist = false;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].equals(input_name)){
//                System.out.println("Position of the students in the list " + input_name+" is "+ i);;
//                isExist=true;
//                break;
//            }
//        }
//        if (!isExist){
//            System.out.println("Not found " + input_name + " in the list.");
//        }
        // Cách 2 :


    }

    public static int searchByElement(String[] arr, String element, int size) {
        for (int i = 0; i < size; i++) {
            if (element.equals(arr[i])) {//*  .equals   dùng để so sánh chuỗi trong java
                return i;
            }
        }
        return -1;
    }
}
