import java.util.Arrays;

public class bubbleSort {
	
	static void bSort(int [] array, boolean isAsc) {
		int size = array.length;
		if (isAsc)System.out.println("Bubble Sort Ascending\n");
		else System.out.println("Bubble Sort Descending\n");

		for (int i = 0; i <size-1;i++){
			System.out.println("Iteration #"+(i+1)+" :");
			System.out.println(Arrays.toString(array));
			if (isAsc) {
				for (int j = 0; j < size-i-1;j++) {					
						if (array[j]>array[j+1]) {					
							int temp = array[j];
							array[j] = array [j+1];
							array[j+1]=temp;
						}
					System.out.println(Arrays.toString(array));				
				}
				System.out.println();
			}else {
				for (int j = 0; j < size-i-1;j++) {					
					if (array[j]<array[j+1]) {					
						int temp = array[j];
						array[j] = array [j+1];
						array[j+1]=temp;					
					}
				System.out.println(Arrays.toString(array));				
				}
			System.out.println();
			}
		}	
		System.out.println("\nSorted Array is : "+Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		int [] array = {-2,45,0,11,-9};
		bubbleSort.bSort(array,false);
	}

}
