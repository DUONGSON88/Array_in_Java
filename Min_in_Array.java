import java.util.Scanner;

public class Min_in_Array {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter size in Array: ");
            size = input.nextInt();
            if (size > 10) {
                System.out.println("Array not over 10!");
            }
        } while (size > 10);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element " + (i + 1) + " is: ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("List element :");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
        int min=arr[0];
        int index =1;
        for (int j = index; j <arr.length ; j++) {
            if(arr[j]<min){
                min=arr[j];
                index=j+1;
            }
        }
        System.out.print("Min =" +min + " a index of " + index +" in the list.");
    }
}

