package com.java.leetcode;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("----- BUBBLE SORT---- ");
		int[] arr1 = { 4, 6, 1, 0, 3, 8 };
		BubbleSort bubble = new BubbleSort();
		bubble.sortArray(arr1);
		for (int i : arr1)
			System.out.print(i + " ");
		
		System.out.println("----- SELECTION SORT---- ");
		int[] arr2 = { 4, 6, 1, 0, 3, 8 };
		SelectionSort selection = new SelectionSort();
		selection.sortArray(arr2);
		for (int i : arr2)
			System.out.print(i + " ");
		
		
		System.out.println("----- INSERTION SORT---- ");
		int[] arr3 = { 4, 6, 1, 0, 3, 8 };
		InsertionSort insertion = new InsertionSort();
		insertion.sortArray(arr3);
		for (int i : arr3)
			System.out.print(i + " ");
		
	}

}
