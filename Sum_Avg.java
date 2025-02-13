import java.util.Scanner;

public class Sum_Avg {
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
        
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("sum of all element is = "+sum);
        float avg = sum/l;
        System.out.println("the average of all element is = "+avg);

    }
}
