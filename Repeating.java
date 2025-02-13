import java.util.Scanner;

public class Repeating {
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

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("first repeating element in array is = "+arr[i]);
                    break;
                }
            }

        }
    }
}
