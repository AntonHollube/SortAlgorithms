package insertion_sort;

import java.util.Arrays;

public class InsertionSort {

    // TODO: implement in-place InsertionSort
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++){
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && key < a[j]){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
    //Anton und Lorenz waren hier


    // You can use the main method to locally test your current implementation
    public static void main(String[] args) {
        int[] a = {28, 58, 23, 17, 91, 11, 80, 54};
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

}