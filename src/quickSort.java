import java.util.Arrays;
//quickSort is so hardd bruvvv
public class quickSort {
    static void qSort(int array[], boolean isAc) {

        int size = array.length;
        int pivot = array[size-1];
        int i = -1;

        for (int j = 0; j < size-1; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[size-1];
        array[size-1] = temp;

    }


    public static void main (String [] args){
        int [] array = {20,12,10,15,2};
        quickSort.qSort(array,true);
        System.out.println("\nSorted Array: "+Arrays.toString(array));
    }
}