public class SelectionSort {

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

    private void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, min, i);
        }
    }

    public static void main(String[] args) {

        //Creating new object of the Selection Sort
        SelectionSort arr = new SelectionSort();

        System.out.println("Inputted array: ");
        int[] array = new int[]{5, 4, 3, 2, 1};
        arr.showArray(array);

        //Going to sort array
        arr.selectionSort(array);

        //Show sorted array
        System.out.println("Sorted array: ");
        arr.showArray(array);

    }
}
