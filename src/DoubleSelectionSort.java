public class DoubleSelectionSort {

    private void showArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.print("\n");
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void doubleSelectionSort(int[] array){
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int min = array[i], max = array[i];
            int minIndex = i, maxIndex = i;
            for (int k = i; k <= j; k++) {
                if (array[k] > max) {
                    max = array[k];
                    maxIndex = k;
                } else if (array[k] < min) {
                    min = array[k];
                    minIndex = k;
                }
            }
            swap(array, i, minIndex);
            if (array[minIndex] == max) {
                swap(array, j, minIndex);
            } else {
                swap(array, j, maxIndex);
            }
        }
    }

    public static void main(String[] args) {

        //Creating new object of the Double Selection Sort
        DoubleSelectionSort arr = new DoubleSelectionSort();

        System.out.println("Inputted array: ");
        int[] array = new int[]{5, 4, 3, 2, 1};
        arr.showArray(array);

        //Going to sort array
        arr.doubleSelectionSort(array);

        //Show sorted array
        System.out.println("Sorted array: ");
        arr.showArray(array);

    }
}
