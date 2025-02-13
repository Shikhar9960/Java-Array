import java.util.Arrays;
import java.util.Scanner;

public class LongConsecutiveSeries {
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

        // Sort the array
        Arrays.sort(arr);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // Ignore duplicates
                if (arr[i] == arr[i - 1] + 1) {
                    currentStreak++;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        System.out.println("the longest consecutive series in array is " + Math.max(longestStreak, currentStreak));

    }
}
