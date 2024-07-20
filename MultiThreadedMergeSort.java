package com.javapractice;

import java.util.Arrays;

class MergeSortTask implements Runnable {

	private final int[] array;
	private final int left;
	private final int right;

	public MergeSortTask(int[] array, int left, int right) {
		this.array = array;
		this.left = left;
		this.right = right;
	}

	@Override
	public void run() {
		// If the array contains more than one element, sort it
		if (left < right) {
			int mid = (left + right) / 2;

			// Sort the first half in a separate thread
			Thread leftSorter = new Thread(new MergeSortTask(array, left, mid));
			leftSorter.start();

			// Sort the second half in a separate thread
			Thread rightSorter = new Thread(new MergeSortTask(array, mid + 1, right));
			rightSorter.start();

			try {
				// Wait for both sorting threads to complete
				leftSorter.join();
				rightSorter.join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			// Merge the sorted halves
			merge(array, left, mid, right);
		}
	}

	// Merge two sorted subarrays into a single sorted subarray
	private void merge(int[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		System.arraycopy(array, left, leftArray, 0, n1);
		System.arraycopy(array, mid + 1, rightArray, 0, n2);

		int i = 0, j = 0;
		int k = left;

		// Merge the temporary arrays back into the original array
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		// Copy any remaining elements of leftArray
		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		// Copy any remaining elements of rightArray
		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}
}

public class MultiThreadedMergeSort {

	public static void main(String[] args) {
		int[] array = { 38, 27, 43, 3, 9, 82, 10 };

		System.out.println("Original array: " + Arrays.toString(array));

		// Create the initial merge sort task
		MergeSortTask sortTask = new MergeSortTask(array, 0, array.length - 1);

		// Start the sorting task in a new thread
		Thread mainSorter = new Thread(sortTask);
		mainSorter.start();

		try {
			// Wait for the sorting thread to complete
			mainSorter.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("Sorted array: " + Arrays.toString(array));
	}
}
//out puts
Original array: [38, 27, 43, 3, 9, 82, 10]
Sorted array: [3, 9, 10, 27, 38, 43, 82]