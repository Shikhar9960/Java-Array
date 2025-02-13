import java.util.Scanner;

public class SecondLargest {
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

        int largest = arr[0];
        int secLargest =arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (largest<arr[i]) {
              secLargest = largest;
              largest=arr[i];  
            }
            if (largest>secLargest && secLargest>arr[i]) {
                System.out.println("second largest element in array is = " + secLargest);
                break;
            }
        }

        

    }
}
