package com.scaler.sorting;

public class SelectionSort {

	public static void main(String[] args) {
     
		int[] a= {3,8,9,0,-6,4,3,11,2};
		a=selectionSort(a);
		printArray(a);
	}
    
	static int[] selectionSort(int[] a) {
		int min;
		int index;
		
		if(a.length==0||a.length==1)
			return a;
		
		for(int i=0; i<a.length;i++) {
			min=a[i];
			index=i;
			boolean flag=true;
			for(int j=i+1; j<a.length;j++) {
				
				if(a[j]<min) {
					min=a[j];
					index=j;
				}
				
				//for optimization you will set a flag and check that if every no is already sorted form
				//if yes then break from ith loop no nned to swap
				if(j<a.length && a[j-1]>a[j])
					flag=false;
				
			}
			if(flag)
				break;
			
		  swap(index, i,a);
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
