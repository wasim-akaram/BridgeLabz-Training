package com.algorithmanalysis;
import java.util.Arrays;
import java.util.Random;

public class SortingAlgoPerformance {

    // -------- Bubble Sort --------
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    
    // -------- Quick Sort --------
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    
 // -------- Merge Sort --------
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }


    // -------- Main Method --------
    public static void main(String[] args) {

        int size = 50000; 
        Random random = new Random();

        int[] arr1 = random.ints(size, 0, size).toArray();
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();

        // Bubble Sort
        long start = System.nanoTime();
        bubbleSort(arr1);
        long bubbleTime = System.nanoTime() - start;

        // Merge Sort
        start = System.nanoTime();
        mergeSort(arr2);
        long mergeTime = System.nanoTime() - start;

        // Quick Sort
        start = System.nanoTime();
        quickSort(arr3, 0, arr3.length - 1);
        long quickTime = System.nanoTime() - start;

        System.out.println("Dataset Size: " + size);
        System.out.println("Bubble Sort Time (ms): " + bubbleTime / 1000000.0);
        System.out.println("Merge Sort Time (ms): " + mergeTime / 1000000.0);
        System.out.println("Quick Sort Time (ms): " + quickTime / 1000000.0);
    }
}
