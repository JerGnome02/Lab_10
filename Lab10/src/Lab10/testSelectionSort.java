package Lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSelectionSort {
	SelectionSort temp = new SelectionSort();

	//@Test
	public void test() {

	testPositive();
	testNegative();
	testMixed();
	testDuplicates();
	}

	public testSelectionSort() {
	}

	@Test
	public void testPositive(){
		int[] arr = new int[5];
	    arr[0] = 8;
	    arr[1] = 9;
	    arr[2] = 7;
	    arr[3] = 10;
	    arr[4] = 2;

	    int[] Sortedarr = new int[5];
	    Sortedarr[0] = 2;
	    Sortedarr[1] = 7;
	    Sortedarr[2] = 8;
	    Sortedarr[3] = 9;
	    Sortedarr[4] = 10;



	        /** add tests to check for this unit test **/
	    temp.basicSelectionSort(arr);
	    for(int i = 0; i < Sortedarr.length; ++i) {
	    	assertEquals(Sortedarr[i], arr[i]);
	    }

	    }

	@Test
	    public void testNegative(){
			int[] arr = new int[5];
		    arr[0] = -8;
		    arr[1] = -9;
		    arr[2] = -7;
		    arr[3] = -10;
		    arr[4] = -2;

		    int[] Sortedarr = new int[5];
		    Sortedarr[0] = -10;
		    Sortedarr[1] = -9;
		    Sortedarr[2] = -8;
		    Sortedarr[3] = -7;
		    Sortedarr[4] = -2;

	        /** Test data contains negative values only **/
		    temp.basicSelectionSort(arr);
		    for(int i = 0; i < Sortedarr.length; ++i) {
		    	assertEquals(Sortedarr[i], arr[i]);
		    }
	    }

	@Test
	    public void testMixed(){
			int[] arr = new int[5];
		    arr[0] = -8;
		    arr[1] = 9;
		    arr[2] = -7;
		    arr[3] = 10;
		    arr[4] = -2;

		    int[] Sortedarr = new int[5];
		    Sortedarr[0] = -8;
		    Sortedarr[1] = -7;
		    Sortedarr[2] = -2;
		    Sortedarr[3] = 9;
		    Sortedarr[4] = 10;
	        /** Test data contains with both positive, negative and zeros **/
		    temp.basicSelectionSort(arr);
		    for(int i = 0; i < Sortedarr.length; ++i) {
		    	assertEquals(Sortedarr[i], arr[i]);
		    }
	    }

	@Test
	    public void testDuplicates(){
			int[] arr = new int[10];
		    arr[0] = 8;
		    arr[1] = 9;
		    arr[2] = 7;
		    arr[3] = 10;
		    arr[4] = -2;
		    arr[5] = -8;
		    arr[6] = -9;
		    arr[7] = 7;
		    arr[8] = -10;
		    arr[9] = -2;

		    int[] Sortedarr = new int[10];
		    Sortedarr[0] = -10;
		    Sortedarr[1] = -9;
		    Sortedarr[2] = -8;
		    Sortedarr[3] = -2;
		    Sortedarr[4] = -2;
		    Sortedarr[5] = 7;
		    Sortedarr[6] = 7;
		    Sortedarr[7] = 8;
		    Sortedarr[8] = 9;
		    Sortedarr[9] = 10;

	        /** Test data contains duplicates **/
		    temp.basicSelectionSort(arr);
		    for(int i = 0; i < Sortedarr.length; ++i) {
		    	assertEquals(Sortedarr[i], arr[i]);
		    }
	    }

}
