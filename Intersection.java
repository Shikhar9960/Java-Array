import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int l;
        System.out.println("enter the size of array");
        l = sc.nextInt();
        int arr[] = new int[l];
        
        System.out.println("enter the elements in first array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int arr1[]= new int[l];
        System.out.println("enter element in second array");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= sc.nextInt();
        }
        

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (arr[i]==arr1[j]) {
                    System.out.println("commom elements are = "+ arr[i]);
                }
            }
        }


       
    }
}
