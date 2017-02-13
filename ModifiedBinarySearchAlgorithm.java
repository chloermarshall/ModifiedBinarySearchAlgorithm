import static org.junit.Assert.*; 

import org.junit.Before;
import org.junit.Test;

//Binary search algorithm is used to return the index of the insertion point in the tested array
//The returned index is used to insert the following number appropriately in the array
//while preserving the order of the original array

public class ModifiedBinarySearchAlgorithm {
	
	public static void main(String[] args){
		int search = (Integer) 38;
		Integer[] array = {2, 4, 16, 38, 44, 51, 66, 67, 84, 99, 100};
		
		ModifiedBinarySearchAlgorithm test = new ModifiedBinarySearchAlgorithm();
		
		int productOfSearch = test.binarySearch(array, search);
		System.out.println(productOfSearch);
	}

	public int binarySearch(Comparable [] objArray, Comparable searchObj)
	{
		int low = 0;
		int high = objArray.length - 1;
		int mid = 0;
		int key = 0;
		
		
		while (low <= high){
			mid = (low + high)/2;
			if(objArray[mid].compareTo(searchObj) < 0){
				low = mid + 1;
				key = low;
				
			}
			else if(objArray[mid].compareTo(searchObj) > 0){
				high = mid - 1;
				key = high + 1;
			}
			else{
				return mid;
			}
		

	}
		return key;
}
		
	}


