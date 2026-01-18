package com.zipzipmart;
class MergeSort {

    // Main merge sort function
    public void mergeSort(SalesRecord[] records, int left, int right) {
        if (left < right) {

            // Divide
            int mid = (left + right) / 2;

            mergeSort(records, left, mid);
            mergeSort(records, mid + 1, right);

            // Conquer (merge)
            merge(records, left, mid, right);
        }
    }

    // Merge two sorted halves
    private void merge(SalesRecord[] records, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        SalesRecord[] L = new SalesRecord[n1];
        SalesRecord[] R = new SalesRecord[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = records[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = records[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge while preserving stability
        while (i < n1 && j < n2) {

            // Sort by date first, then amount
            if (L[i].date.compareTo(R[j].date) < 0 ||
               (L[i].date.compareTo(R[j].date) == 0 &&
                L[i].amount <= R[j].amount)) {

                records[k++] = L[i++];
            } else {
                records[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1)
            records[k++] = L[i++];

        while (j < n2)
            records[k++] = R[j++];
    }
}
