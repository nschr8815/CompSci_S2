
public class Merge {

	public static void main(String[] args)
	{
		
	}
	//split into groups
	public void mergeSort(int[] list, int lowIndex, int highIndex) {
		if (lowIndex == highIndex)
			return;
		else {
			int midIndex = (lowIndex + highIndex) /2;
		//The string of numbers get divided here into low and high
			//MergeSort is a method that calls itself and is Recursive
			mergeSort(list, lowIndex, midIndex);
			mergeSort(list, midIndex + 1, highIndex);
			merge(list,lowIndex, midIndex+1,highIndex);
		}
	}
	
	
	
	
}
