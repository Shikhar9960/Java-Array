import java.util.Scanner;

public class Max_Min {
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
        int max=arr[0];
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
            else if (min>arr[i]) {
                min = arr[i];
            }
            else{
                continue;
            }
        }

        System.out.println("max element = "+max+" min element = "+min);
    }
}
