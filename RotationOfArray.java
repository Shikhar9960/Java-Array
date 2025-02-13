import java.util.Scanner;

public class RotationOfArray {
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

        System.out.println("1- rotation \n 3-exit");
        int wants = sc.nextInt();

        switch (wants) {
            case 1:
                System.out.println("how many element you want to rotate");
                int rot = sc.nextInt();
                Rotation(arr, l, rot);
                break;
            case 3:
                System.out.println("program ends");
                break;
            default:
                break;
        }
    }

    public static void Rotation(int[] arr, int l, int rot) {
        for (int r = 0; r < rot; r++) {
            int temp = arr[0];
            for (int i = 0; i < l - 1; i++) {
                arr[i] = arr[i + 1];                // shift element to arr[0]=arr[1] , arr[1]=arr[2]...so on
            }
            arr[l - 1] = temp;
        }
        System.out.println("after rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

}
