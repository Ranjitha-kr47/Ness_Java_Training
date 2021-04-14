package class2;

import java.util.Scanner;

public class demo2 {
	
	public static int maxdiff(int[] A)
    {
        int maxdiff = Integer.MIN_VALUE;
 
        for (int i = 0; i < A.length - 1; i++)
        {
            for (int j = i + 1; j < A.length; j++) {
                maxdiff = Integer.max(maxdiff, A[j] - A[i]);
            }
        }
 
        return maxdiff;
    }
	
	public static int mindiff(int[] A)
    {
        int mindiff = Integer.MAX_VALUE;
 
        for (int i = 0; i < A.length - 1; i++)
        {
            for (int j = i + 1; j < A.length; j++) {
                mindiff = Integer.min(mindiff, A[j] - A[i]);
            }
        }
 
        return mindiff;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, max;
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the size of an array array:");
//        n = s.nextInt();
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
        System.out.println("The maximum difference is " + maxdiff(array1));
        System.out.println("The minimun difference is " + mindiff(array1));
	}

}
