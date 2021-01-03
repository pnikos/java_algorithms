package tables;

import java.util.*;

public class MainTables {
	private Integer[] ar = null;
	private int size = 10;
	
	public MainTables() {
		ar = new Integer[size];
		fillRandom();
	}
	
	public MainTables(int sz) {
		this.size = sz;
		ar = new Integer[size];
		fillRandom();

	}
	
	private void fillRandom() {
		System.out.println("fill random table");
		Random rnd = new Random();
		for (int i=0; i< size; i++) {
			ar[i] = rnd.nextInt(100);
		}		
	}
	
	public void show() {
		for (int i=0; i<size; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
	
	// Average case complexity: O(n^^2)
	public void bubbleSort() {
		System.out.println("Bubble Sort");
		for (int i=size-1; i >= 0; i--) {
			for (int j=0; j <= i - 1; j++) {
				if (ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = ar[j];
				}
			}
		}
	}
	
	// Worst case complexity: O(n^^2)
	// Best case complexity: O(n);
	// Worst case space complexity: O(1)
	public void bubbleSortImproved() {
		System.out.println("Bubble Sort Improved");
		boolean swapped = true;
		for (int i=size-1; i >= 0 && swapped; i--) {
			swapped = false;
			for (int j=0; j <= i - 1; j++) {
				if (ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					swapped = true;
				}
			}
		}
	}
	
	/*
	 * Advantages: easy to implement, in-place sort
	 * Disadvantages: doesn't scale well; O(n^^2)
	 * Worst case complexity: O(n^^2)
	 * Best case complexity: O(n^^2)
	 * Average case complexity: O(n^^2)
	 * Worst case space complexity: O(1) auxiliary
	 */
	public void selectionSort() {
		System.out.println("Selection Sort");
		int min;
		for (int i=0; i< size-1; i++) {
			min = i;
			for (int j=i+1; j<size; j++) {
				if (ar[j] < ar[min]) {
					min = j;
				}
			}
			int temp = ar[min];
			ar[min] = ar[i];
			ar[i] = temp;
		}
	}
	
	/*
	 * Advantages:
	 * Simple implementation
	 * Efficient for small data
	 * Adaptive: If the input list is pre-sorted [may not be completely] 
	 * then insertions sort takes O(n + d), where d is the number of inversions
	 * Practically more efficient than selection and bubble sorts, 
	 * even though all of them have O(n^^2) worst case complexity
	 * Stable: Maintains relative order of input data if the keys are same
	 * In-place: It requires only a constant amount O(1) of additional memory space
	 * Online: Insertion sort can sort the list as it receives it
	 */
	public void insertionSort() {
		System.out.println("Insertion Sort");
		int v, j;
		for (int i=1; i <= size-1; i++) {
			v = ar[i];
			j = i;
			while (j >= 1 && ar[j-1] > v) {
				ar[j] = ar[j-1];
				j--;
			}
			ar[j] = v;
		}
	}
}
