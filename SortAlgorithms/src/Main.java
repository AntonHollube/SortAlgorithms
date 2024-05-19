
public class Main {
    public static void main(String args[])
    {
        int arr[] = {15, 62, 44, 87, 9, 18, 24, 74, 83, 25, 93, 46, 58};

        System.out.println("Given array is");
        printArray(arr);

        // MergeSort ob = new MergeSort();
        // ob.sort(arr, 0, arr.length - 1);

       // int size = arr.length;
       // Quicksort.quickSort(arr, 0, size - 1);

        HeapSort hs = new HeapSort();
        hs.sort(arr);

        // Main.bubbleSort(arr);
        System.out.println("\nSorted array is");
        printArray(arr);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}