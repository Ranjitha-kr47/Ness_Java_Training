package class2;

import java.util.Arrays;
import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name="Agnes";
//		name=name.concat("Kevin");
//		System.out.println(name);

		// declaration
		int[] a;
		int b[];
		int[] c;

		// declaration and instantiation
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// declaration,instantiation,initialization
		int[] numbers = { 40, 50,20, 60,90,70, 80 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		for (int number : numbers) {
			System.out.print(number + " ");
		}
		
		System.out.println();
		int size=numbers.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(numbers[i]>numbers[j]) {
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
				
				
			}
		}
		
		System.out.println("largest number is "+numbers[size-1]);
		System.out.println();

		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(numbers[i]<numbers[j]) {
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
				
				
			}
		}
		
		System.out.println("smallest number is "+numbers[size-1]);
		
		int[][] array = {
	            {10, 50},
	            {40, 80, 70},
	            {100, 20}
	        };
	 
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(Arrays.toString(array[i]));
	        }

	        
	        int n, max;
	        Scanner s = new Scanner(System.in);
//	        System.out.print("Enter the size of an array array:");
//	        n = s.nextInt();
	        int array1[] = new int[5];
	        System.out.println("Enter elements of array:");
	        for(int i = 0; i < 5; i++)
	        {
	            array1[i] = s.nextInt();
	        }
	        
	        System.out.println("original array");
	        for(int i=0;i<array1.length;i++) {
	        	System.out.print(array1[i]+" ");
	        }
	        
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = array1.length-1; i >= 0; i--) {  
	            System.out.print(array1[i] + " ");  
	        } 
	        
	        System.out.println();
	        int[] array2 = new int [] {10,30,20,49,58,60};
	        int start = 1, end = 4;
	 
	        int[] subarray = new int[end - start + 1];
	        System.arraycopy(array2, start, subarray, 0, subarray.length);
	 
	        System.out.println(Arrays.toString(subarray));
	        
	}

}
