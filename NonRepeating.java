import java.util.Scanner;

public class NonRepeating {
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

        for (int i = 0; i < arr.length ; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
               
                if (arr[i]==arr[j] && i != j) {
                    count++;
                }
            }
            if (count==0) {
                System.out.println("the first non repeating element is = "+arr[i]);
                break;
            }
        }
    }

}
