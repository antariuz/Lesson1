public class QuickSort {

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

    private void quickSort(int[] array){

        //setting the Pivot position
        int pivot = array[array.length - 1];
        int pivotIndex = array.length - 1;
        int minIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[pivotIndex]) {
                swap(array, i, minIndex);
                minIndex++;
            }
        }
        int mainPivotIndex = array.length - 1;
        if (minIndex != 0) {
            mainPivotIndex = minIndex;
        }
        swap(array, array.length - 1, mainPivotIndex);

        //Quick sort in the left side of the main Pivot
        for (int i = 0; i < mainPivotIndex - 1; i++) {
            int leftPivot = array[mainPivotIndex - i - 1];
            for (int j = 0; j < mainPivotIndex - 1; j++) {
                if (array[j] > leftPivot) {
                    swap(array, j, mainPivotIndex - j);
                }
            }
        }

        //Quick sort in the right side of the main Pivot
        for (int i = mainPivotIndex + 1; i < array.length - 1; i++) {
            int rightPivot = array[array.length - 1];
            for (int j = mainPivotIndex + 1; j < array.length - 1; j++) {
                if (array[j] > rightPivot) {
                    swap(array, j, array.length - 1);
                }
            }
        }
    }

    public static void main(String[] args) {

        //Creating new object of the Quick Sort
        QuickSort arr = new QuickSort();

        System.out.println("Inputted array: ");
        int[] array = new int[]{5, 4, 3, 2, 1};
        arr.showArray(array);

        //Going to sort array
        arr.quickSort(array);

        //Show sorted array
        System.out.println("Sorted array: ");
        arr.showArray(array);

    }
}
