import java.util.Arrays;

public class selectionSort {

	static void selecSort(int [] array,boolean isAsc) {
		
		int size = array.length;
		if (isAsc)System.out.println("Selection Sort Ascending\n");
		else System.out.println("Bubble Sort Descending\n");
		for (int i =0;i< size-1;i++) {
			System.out.println("Iteration #"+(i+1)+" :");
			System.out.println(Arrays.toString(array));
			int min_index = i;
			
			if (isAsc) {
				for (int j = i+1; j<size;j++) {				
					if (array[j]<array[min_index]) {
						min_index = j;
					}
					System.out.println(Arrays.toString(array));
				}
			}else {
				for (int j = i+1; j<size;j++) {				
					if (array[j]>array[min_index]) {
						min_index = j;
					}
					System.out.println(Arrays.toString(array));
				}
			}			
			int temp = array[i];
			array[i] = array[min_index];
			array[min_index] = temp;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		int [] array = {20,12,10,15,2};
		
		selectionSort.selecSort(array,false);


	}

}
