import java.util.Scanner;

public class Max_in_Array {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a size :");
            size = input.nextInt();
            if (size > 10)
                System.out.println("Không tạo mảng size quá 10 phần tử ");
        } while (size > 10);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("List Element:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println(" max của mảng đã nhập là :");
        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println(max + " at position " + index+ " in the list");
    }

}
