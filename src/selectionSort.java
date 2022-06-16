import java.util.Arrays;

public class selectionSort {

    static void selectSort(int [] array,boolean isAsc) {

        int size = array.length;
        if (isAsc)System.out.println("Selection Sort Ascending");
        else System.out.println("Selection Sort Descending");
        System.out.println("Original Array: "+Arrays.toString(array)+"\n");
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
            System.out.println();
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int [] array = {20,12,10,15,2};
        selectionSort.selectSort(array,false);
        System.out.println("\nSorted Array: "+Arrays.toString(array));
    }
}