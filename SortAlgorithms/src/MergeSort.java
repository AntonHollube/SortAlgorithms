package merge_sort;
import java.util.Random;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        //int n = 10;
        int[] A = (new Random()).ints(n, Integer.MIN_VALUE, Integer.MAX_VALUE).toArray();
        int[] B = (new Random()).ints(n, Integer.MIN_VALUE, Integer.MAX_VALUE).toArray();

        long start = System.nanoTime();
        MergeSort.mergeSort(A);
        long end = System.nanoTime();

        long start1 = System.nanoTime();
        MergeSort.insertionSort(B);
        long end1 = System.nanoTime();

        System.out.println("MergeSort: " + (end - start) / 1000000.0 + " ms");
        System.out.println("InsertionSort: " + (end1 - start1) / 1000000.0 + " ms");
    }

    //INITIALISIERUNG VON MERGESORT
    public static void mergeSort(int[] A) {
        mergeSort(A, 0, A.length - 1);
    }

    // CODE für INSERTIONSORT
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && key < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    //CODE für MERGESORT
    private static void mergeSort(int[] A, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(A, l, m);
            mergeSort(A, m+1, r);
            merge(A, l, m, r);
        }
    }

    // CODE für MERGE
    private static void merge(int[] A, int l, int m, int r) {
        int[] hilfs = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (A[i] <= A[j]) {
                hilfs[k] = A[i];
                k += 1; i += 1;
            } else {
                hilfs[k] = A[j];
                k += 1; j += 1;
            }
        }
        while (i <= m) {
            hilfs[k] = A[i];
            k += 1; i += 1;
        }
        while (j <= r) {
            hilfs[k] = A[j];
            k += 1; j += 1;
        }
        for (i = l; i <= r; i += 1) {
            A[i] = hilfs[i - l];
        }
    }
}