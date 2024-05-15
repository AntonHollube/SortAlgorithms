

public class MergeSort {

    //INITIALISIERUNG VON MERGESORT
    public static void mergeSort(int[] A) {
        mergeSort(A, 0, A.length - 1);
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