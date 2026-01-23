package com.medwarehouse;

import java.time.LocalDate;

public class Main {

	// Merge Sort
	public static void mergeSort(Medicine[] meds, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(meds, left, mid);
			mergeSort(meds, mid + 1, right);

			merge(meds, left, mid, right);
		}
	}

	// Merge two sorted subarrays
	private static void merge(Medicine[] meds, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		Medicine[] L = new Medicine[n1];
		Medicine[] R = new Medicine[n2];

		for (int i = 0; i < n1; i++)
			L[i] = meds[left + i];
		for (int j = 0; j < n2; j++)
			R[j] = meds[mid + 1 + j];

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (L[i].expiryDate.isBefore(R[j].expiryDate) || L[i].expiryDate.isEqual(R[j].expiryDate)) {
				meds[k++] = L[i++];
			} else {
				meds[k++] = R[j++];
			}
		}

		while (i < n1)
			meds[k++] = L[i++];
		while (j < n2)
			meds[k++] = R[j++];
	}

	// Driver code
	public static void main(String[] args) {

		Medicine[] inventory = { new Medicine("Paracetamol", LocalDate.of(2025, 1, 15)),
				new Medicine("Insulin", LocalDate.of(2024, 10, 10)),
				new Medicine("Antibiotic", LocalDate.of(2024, 12, 5)),
				new Medicine("Vitamin C", LocalDate.of(2026, 11, 20)) };

		mergeSort(inventory, 0, inventory.length - 1);

		System.out.println("Medicines sorted by expiry date:");
		for (Medicine m : inventory) {
			System.out.println(m.name + " -> " + m.expiryDate);
		}
	}
}