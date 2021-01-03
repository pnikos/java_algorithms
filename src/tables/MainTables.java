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
	
	// Average case complexity: O(2^^n)
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
}
