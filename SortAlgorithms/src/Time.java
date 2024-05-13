/*

import java.util.Random;

public class Time {
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
*/