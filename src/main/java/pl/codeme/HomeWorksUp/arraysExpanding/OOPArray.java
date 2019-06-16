package pl.codeme.HomeWorksUp.arraysExpanding;

public class OOPArray {
	
	int[] array = new int[5]; 
	 

	public int[] add(int value) {

		if (value > array.length) {
			int[] expandedArray = new int[array.length + (value - array.length)];

			for (int i = 0; i < array.length; i++) {
				expandedArray[i] = array[i];
			}
 
			array = expandedArray;
		}

		return array; 
	}

	public int getIdx(int value) {

		return array[value];
	} 
 
}
 