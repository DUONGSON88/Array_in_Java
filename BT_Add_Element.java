import java.util.Scanner;

public class BT_Add_Element {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter size of Array : ");
            size = input.nextInt();
            if (size > 10) {
                System.out.println("Array not over 10 ! Please enter again! ");
            }
        } while (size > 10);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.print("List element : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println("Add elment: Enter new element");
        int newElement=input.nextInt();


    }
    public static void addElement(int[] arr,int elementNew,int index){
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
