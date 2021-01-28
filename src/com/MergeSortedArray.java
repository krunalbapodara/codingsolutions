package com;

/*** merge two sorted arrays ***/

public class MergeSortedArray {
	public static int[] mergeSortedArr(int[] arr1, int[] arr2) {
		if (arr1.length == 0 && arr2.length != 0) {
			return arr2;
		}

		if (arr2.length == 0) {
			return arr1;
		}

		int[] sortedArr = new int[(arr1.length + arr2.length)];
		int i = 0;
		int j = 0;
		int count = 0;
		int firstArrItem = arr1[0];
		int secondArrItem = arr2[0];

		while (i < arr1.length || j < arr2.length) {
			if (secondArrItem == -1 || firstArrItem < secondArrItem) {
				sortedArr[count] = firstArrItem;
				if (i < arr1.length - 1) {
					firstArrItem = arr1[i + 1];
				}
				i++;
			} else {
				sortedArr[count] = secondArrItem;
				if (j < arr2.length - 1) {
					secondArrItem = arr2[j + 1];
				} else {
					secondArrItem = -1;
				}
				j++;
			}
			count++;
		}

		return sortedArr;
	}

	public static void main(String[] args) {
		for (int ii : mergeSortedArr(new int[] { 0, 3, 4, 31 }, new int[] { 4, 6, 30 })) {
			System.out.println(ii);
		}
	}
}
