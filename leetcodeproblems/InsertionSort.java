package com.scaler.sorting;

public class InsertionSort { 
	
	public static void main(String[] args) {
		int[] a= {3,8,9,0,-6,4,3,11,2};
		insertionSort(a);
		printArray(a);
	}

	static  int[] insertionSort(int[] a) {
		
		for(int i=1;i<a.length; i++) {
			int key=a[i];
			for(int j=i-1; j>=0; j--) {
				if(key<a[j]) {
					a[j+1]=a[j];
				    a[j]=key;
				}
				else 
					break;
			} 			
		}
		
		return a;
		
	
	}
	
	static void swap(int index, int i, int[] a) {
		int temp=a[i];
		a[i]=a[index];
		a[index]=temp;
	}
	
	static void printArray(int[] a) {
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
