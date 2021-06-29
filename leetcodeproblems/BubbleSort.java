package com.scaler.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,0};
		a=bubbleSort(a);
		printArray(a);
	}
	
	static int[] bubbleSort(int[] a) {
		 
		for(int i=0; i<a.length; i++) {
			boolean flag=true;
			
			for(int j=a.length-1;j>i;j--) {
				if(a[j]<a[j-1]) {
					swap(j,j-1,a);
          //this flag is to check whether any swap is done or not like array already in sorted fashion 
          //then no swap done so we can break the ith loop this will optimize algo.
					flag=false;
				}
			}
			
			if(flag)
				break;
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
