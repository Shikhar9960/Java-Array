import java.util.Scanner;

public class SecondSmallest {
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

        int smallest = Integer.MAX_VALUE;
        int secsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                secsmallest = smallest;
                smallest = arr[i];
            }
            if (arr[i] > smallest && arr[i] < secsmallest) {
                secsmallest = arr[i];
            }
        }
        System.out.println("second smallest element in array is = " + secsmallest);

    }
}
