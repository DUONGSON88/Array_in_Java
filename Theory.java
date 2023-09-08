import java.util.Arrays;
import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        // ôn lại kiến thức về mảng:
int [] arr = {1,2,3 };// length =3 ; size =3

int [] arr2 = new int[4]; // khởi tạo 1 mảng mới có length 4 size 0;
//khi khai báo bằng từ khóa new nó sẽ tạo 1 mảng có dộ dài đc chỉ định trong mảng chứa các giá trị mặc định.
// int:0 double0.0 String: null boolean:false;
        }
    }
    class main2{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Size Array :");
            int length= input.nextInt();
            int[] arr= new int[length];
            int size=0;
            size=addElement(arr,-1,size);
            size=addElement(arr,-10,size);
            size=addElement(arr,-2,size);
            size=addElement(arr,-9,size);
            size=addElement(arr,-8,size);
            System.out.println(Arrays.toString(arr));
            System.out.println("size is :" + size);
            System.out.println("index of elemnt 1 "+searchElement(arr,1,size));

//            while (size!=length){
//                System.out.println("nhap phan tu thu "+ size);
//                int element = input.nextInt();
//                arr[size]= element;
//                size++;
//            }
//            System.out.println(Arrays.toString(arr));
        }
        public static int addElement(int[] arr , int element , int size){
               arr[size]=element;
               size++;
               return size;
        }
        public static int searchElement(int[] arr, int element, int size){
            for (int i = 0; i < size; i++) {
                if (element==arr[i]){
                    return i;
                }
            }
            return -1;
        }
    }