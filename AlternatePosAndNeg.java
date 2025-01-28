public class AlternatePosAndNeg {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, -3, -5, -8, -4, 7 };
        int arr1[] = new int[arr.length];
        int a=0;
        int b=1;
        

        for (int i = 0; i < arr1.length-1; i++) {
            if (arr[i]>=0) {
                arr1[a]=arr[i];
                a=a+2;
            }            
            if (arr[i]<0) {
                arr1[b]=arr[i];
                b=b+2;
            }
        }
        
     

        System.out.println("after converison");

        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
