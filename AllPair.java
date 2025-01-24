import java.util.Scanner;

public class AllPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,9,3,4,7,8};
        int key;
        System.out.println("enter the key");
        key=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
           for (int j = 1; j < arr.length; j++) {
             if (key == arr[i]+arr[j]) {
                System.out.println("sum of this pair = ("+arr[i]+","+arr[j]+") = "+key);
             }
           }
        }
    }
}
