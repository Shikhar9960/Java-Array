import java.util.Scanner;

public class SubArrayEqualZero {
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

        int sum = 0;
       
        for (int i = 0; i < arr.length; i++) { // start index
           
            int curSum = 0;
            for (int j = i; j < arr.length; j++) { // End index
                curSum += arr[j];

                // Check if the current subarray has a sum of zero
                if (curSum == 0) {
                    System.out.println("Subarray with sum zero found:");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                    
                }
        }
    }

    }}
