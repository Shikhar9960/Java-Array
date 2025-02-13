import java.util.Scanner;

//(Kadane's Algorithm)

public class MaximumSubarray {
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

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]); // becauswe if there se negative number then  it will choose from next number
            maxSum = Math.max(maxSum, currentSum); // compare krega pehle wala or ab wala sum ka kon sa bada h...till loop complete
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
    }

}
