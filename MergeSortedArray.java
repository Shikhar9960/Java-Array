public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = { 2, 4, 6, 8, 10 };
        int arr2[] = { 1, 3, 5, 7, 9 };

        int t = arr1.length + arr2.length; // Total size of the merged array
        int merge[] = new int[t];
        
        int c = 0; // Pointer for the merged array
        int f = 0; // Pointer for arr1
        int s = 0; // Pointer for arr2

        // Merge elements from both arrays in sorted order
        while (f < arr1.length && s < arr2.length) {
            if (arr1[f] < arr2[s]) {
                merge[c] = arr1[f];
                f++;
            } else {
                merge[c] = arr2[s];
                s++;
            }
            c++;
        }

        // Add remaining elements from arr1, if any
        while (f < arr1.length) {
            merge[c] = arr1[f];
            f++;
            c++;
        }

        // Add remaining elements from arr2, if any
        while (s < arr2.length) {
            merge[c] = arr2[s];
            s++;
            c++;
        }

        // Print the merged array
        System.out.println("Merged array is:");
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
