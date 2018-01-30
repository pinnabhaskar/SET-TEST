/**
 * 
 */
package com.sei.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author pinna
 *
 */
public class DeDup {
	
    public static int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
  
	public static List<Integer>filerUniqueIntegers(int[] arr){
		List<Integer>tempList= new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
               System.out.print(arr[i]+" ");
               tempList.add(arr[i]);
                
            }
        }
		return tempList;
		
    }
	
	static void eliminateDuplicateUsingArrayList(int[] arrayWithDuplicates) {
	     ArrayList<Integer> list = new ArrayList<Integer>();
	     for (int counter = 0; counter < arrayWithDuplicates.length; counter++) {
		if (!list.contains(arrayWithDuplicates[counter]))
	            list.add(arrayWithDuplicates[counter]);
		}
	     System.out.println("Array without duplicates with List approach");
	     System.out.println("\n:");
	     Integer[] arrayWithoutDuplicates = list.toArray(new Integer[0]);
	     // print the unique array
	     for (int counter = 0; counter < arrayWithoutDuplicates.length; counter++) {
		System.out.println(arrayWithoutDuplicates[counter]);
	        System.out.print(" ");
	     }
	}
	
	static void eliminateDuplicateUsingSet(int[] arrayWithDuplicates) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int counter = 0; counter<arrayWithDuplicates.length; counter++) {
			set.add(arrayWithDuplicates[counter]);
		}
		Integer[] newArr = set.toArray(new Integer[0]);
		System.out.println("Array without duplicates with LinkedHash Set:");
		// print the unique array
		for (int counter = 0; counter < newArr.length; counter++) {
			System.out.print(newArr[counter]);
	                System.out.print(" "); 
		}
	}	

	static void eliminateUsingJavaStreams(int[] arrayWithDuplicates) {
		int[] arrayWithOutDuplicates= Arrays.stream(arrayWithDuplicates).distinct().toArray();
		System.out.println("\n");
		System.out.println("Array without duplicates with Java8\n");
		// print the unique array
		for (int counter = 0; counter < arrayWithOutDuplicates.length; counter++) {
		    System.out.println(arrayWithOutDuplicates[counter]);
	             
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("randomIntegers before removing:"+randomIntegers.toString());
		//approach-1
	List<Integer> tempList=filerUniqueIntegers(randomIntegers);
	System.out.println("\n UniqueList:"+tempList.toString());
	//approach-2 with set concept.
	eliminateDuplicateUsingSet(randomIntegers);
	//approach-3 with java8
	eliminateUsingJavaStreams(randomIntegers);
	//approach-4 using array list.
	eliminateDuplicateUsingArrayList(randomIntegers);
	}
	   
	}
	
	

