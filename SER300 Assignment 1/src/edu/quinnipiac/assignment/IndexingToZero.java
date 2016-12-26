package edu.quinnipiac.assignment;
public class IndexingToZero {

	private int[] array1000 = {0, 1, 5, 2, 7, 3, 0, 10};
	private int[] array = {0, 1, 5, 2, 7, 3, 0, 10};

	//constructor
	public IndexingToZero(){	

	}
	
	//return any array
	public int[] getAnArray(){return array;}//used to compare old and new array

	//traverses the array and does the operation 
	public int[] operation(){//returns a array 
		for(int i = 0; i < array1000.length-1; i++){
			if( i > array1000[i]){
				array1000[i] = 0;	
			}
		}
		return array1000;
	}
}

