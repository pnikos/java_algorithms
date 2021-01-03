package main;

import tables.MainTables;

public class Main {

	public static void main(String[] args) {
		MainTables mt1 = new MainTables();
		mt1.show();
		mt1.bubbleSort();
		mt1.show();
		
		MainTables mt2 = new MainTables();
		mt2.show();
		mt2.bubbleSortImproved();
		mt2.show();
		
		MainTables mt3 = new MainTables();
		mt3.show();
		mt3.selectionSort();
		mt3.show();
		
		MainTables mt4 = new MainTables();
		mt4.show();
		mt4.insertionSort();
		mt4.show();
	}

}
