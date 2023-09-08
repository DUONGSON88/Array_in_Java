import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BT_Delete_Array {

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter size Array : ");
            size = input.nextInt();
            if (size > 10) {
                System.out.println("Array not over 10");
            }
        } while (size > 10);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter elment :" + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("List element : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
        System.out.println("Do you want to delete any elements?");
        System.out.println("import that element:");
        int elementDelete = input.nextInt();
        for (int j = 0; j < size; j++) {
            if (elementDelete == arr[j]) {
                for (int k = j; k < size - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                arr[size - 1] = 0;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
//        System.out.println(deleteEle(arr,elementDelete, arr.length));
//        System.out.println("New Array : "+Arrays.toString(arr));

    }
//    public static int deleteEle(int[] arr , int element,int size){
//        int index = searchByElement(arr,element,size);
//        for (int i = index; i <size-1 ; i++) {
//              arr[i]=arr[i+1];
//
//            }
//        arr[size-1]=0;
//        return size;
//    }
//    public static int searchByElement(int[] arr, int element, int size) {
//        for (int i = 0; i < size; i++) {
//            if (element==(arr[i])) {//*  .equals   dùng để so sánh chuỗi trong java
//                return i;
//            }
//        }
//        return -1;
//    }
}
