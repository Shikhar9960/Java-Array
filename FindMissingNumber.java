import java.util.Scanner;

public class FindMissingNumber {
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

        int count =1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==count) {
                count++;
            }
            else{
                System.out.println(count +" element not found");
                break;
            }
        }
    }
}
