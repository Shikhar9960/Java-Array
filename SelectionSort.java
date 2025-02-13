import java.util.Scanner;

public class SelectionSort {
    // Function to perform selection sort on an array
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted portion of the array
            int minIndex = i;
            // Search for the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted portion
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Example array

        Scanner sc = new Scanner(System.in);
        int l;
        System.out.println("enter the size of array");
        l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("enter the elements in array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Sort the array using the selection sort
        selectionSort(arr);

        // Print the sorted array
        System.out.println("\n After Selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
    }
}