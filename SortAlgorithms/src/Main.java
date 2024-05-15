import java.util.Random;

public class Main {
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array is");
        printArray(arr);

        // MergeSort ob = new MergeSort();
        // ob.sort(arr, 0, arr.length - 1);
        HeapSort hs = new HeapSort();
        hs.sort(arr);

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