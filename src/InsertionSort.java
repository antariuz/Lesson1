public class InsertionSort {

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

    private void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (array[i - j + 1] < array[i - j]) {
                    swap(array, i - j + 1, i - j);
                }
            }
        }
    }

    public static void main(String[] args) {

        //Creating new object of the Insertion Sort
        InsertionSort arr = new InsertionSort();

        System.out.println("Inputted array: ");
        int[] array = new int[]{5, 4, 3, 2, 1};
        arr.showArray(array);

        //Going to sort array
        arr.insertionSort(array);

        //Show sorted array
        System.out.println("Sorted array: ");
        arr.showArray(array);

    }
}
