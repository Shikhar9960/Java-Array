import java.util.Scanner;

public class MoveAllZeroInEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l;
        System.out.println("enter the size of array");
        l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("enter the elements in array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < l) {
            arr[index] = 0;
            index++;
        }

        System.out.println("after move all zero to last");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
