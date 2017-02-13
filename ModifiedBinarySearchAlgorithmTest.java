import static org.junit.Assert.*; 

import org.junit.Before;
import org.junit.Test;

public class ModifiedBinarySearchAlgorithmTest {	
	private ModifiedBinarySearchAlgorithm testCase;
	@Before
	public void setUp() throws Exception {
		testCase = new ModifiedBinarySearchAlgorithm();
	}
	//Test cases are matched against the expected index returned from the binarySearch algorithm. 
	//The returned index is used to insert the following number appropriately in the array
	//while preserving the order of the original array
	@Test
	 public void isInLowerBoundaryEvenArray(){
		assertEquals(0, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99}, 2));

	}
	@Test
	 public void DoesNotExistLowerBoundaryEvenArray(){
		assertEquals(0, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99}, 1));

	}
	@Test
	 public void isInLowerBoundaryOddArray(){
		assertEquals(0, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99, 156}, 2));

	}
	@Test
	 public void DoesNotExistLowerBoundaryOddArray(){
		assertEquals(0, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99}, 0));

	}
	@Test
	 public void isInUpperBoundaryEvenArray(){
		assertEquals(9, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99}, 99));

	}
	@Test
	 public void DoesNotExistUpperBoundaryEvenArray(){
		assertEquals(10, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99}, 100));

	}
	
	@Test
	 public void isInUpperBoundaryOddArray(){
		assertEquals(10, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99, 156}, 156));

	}
	@Test
	 public void DoesNotExistUpperBoundaryOddArray(){
		assertEquals(11, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99, 156}, 199));

	}//8 so far
	@Test
	 public void isInBetweenBoundariesEvenArray(){
		assertEquals(5, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99}, 51));

	}
	@Test
	 public void DoesNotExistBetweenBoundariesEvenArray(){
		assertEquals(4, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99}, 40));

	}
	@Test
	 public void isInBetweenBoundariesOddArray(){
		assertEquals(6, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99, 156}, 66));

	}
	@Test
	 public void DoesNotExistBetweenBoundariesOddArray(){
		assertEquals(8, testCase.binarySearch(new Integer[] {2, 4, 16, 38, 44, 51, 66, 67, 84, 99, 156}, 69));

	}
	@Test
	 public void emptyArray(){
		assertEquals(0, testCase.binarySearch(new Integer[] {}, 69));

	}
}

