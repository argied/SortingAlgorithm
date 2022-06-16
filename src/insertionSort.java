import java.util.Arrays;

public class insertionSort {

    static void insertSort(int array[],boolean isAsc) {
        int size = array.length;
        if (isAsc)System.out.println("Insertion Sort Ascending");
        else System.out.println("Insertion Sort Descending");
        System.out.println("Original Array: "+Arrays.toString(array)+"\n");
        for (int i = 1; i < size; i++) {
            System.out.println("Iteration #"+(i)+" :");
            System.out.println(Arrays.toString(array));
            int key = array[i];
            int j = i - 1;

            if (isAsc) {
                while (j >= 0 && key < array[j]) {
                    array[j + 1] = array[j];
                    --j;
                    System.out.println(Arrays.toString(array));
                }

            }else{
                while (j >= 0 && key > array[j]) {
                    array[j + 1] = array[j];
                    --j;
                    System.out.println(Arrays.toString(array));
                }

            }
            array[j+1]=key;
            System.out.println(Arrays.toString(array));
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int [] array = {20,12,10,15,2};
        insertionSort.insertSort(array,false);
        System.out.println("\nSorted Array: "+Arrays.toString(array));
    }
}