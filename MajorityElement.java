import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
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

        for (int i = 0; i < arr.length; i++) {
            int count=0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                }

                if (count>arr.length/2) {
                    System.out.println("majority element is = "+arr[i]);
                    //only return value if there is any element occur more then the half the size of array
                }
            }
        }
        
    }
}

