import java.util.Arrays;

public class bubbleSort {

    static void bSort(int [] array, boolean isAsc) {
        int size = array.length;
        if (isAsc)System.out.println("Bubble Sort Ascending");
        else System.out.println("Bubble Sort Descending");

        System.out.println("Original Array: "+Arrays.toString(array)+"\n");
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
            }else {
                for (int j = 0; j < size-i-1;j++) {
                    if (array[j]<array[j+1]) {
                        int temp = array[j];
                        array[j] = array [j+1];
                        array[j+1]=temp;
                    }
                    System.out.println(Arrays.toString(array));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] array = {0,-8,19,5,-21,2,3,9,-1};
        bubbleSort.bSort(array,true);
        System.out.println("\nSorted Array: "+Arrays.toString(array));
    }
}