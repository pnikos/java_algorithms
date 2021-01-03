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
	}

}
