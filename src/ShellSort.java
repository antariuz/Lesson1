public class ShellSort {

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

    private void shellSort(int[] array) {
        int gap = 2;
        for (int i = gap; i > 0; i--) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[j - i]) {
                    swap(array, j, j - i);
                }
                if (j == array.length - 1) {
                    for (int k = array.length - i - 1; k > 0; k = k - i) {
                        if (array[k - i] > array[k]) {
                            swap(array, k, k - i);
                        }
                    }
                }

            }
        }
    }

    public static void main(String[] args) {

        //Creating new object of the Shell Sort
        ShellSort arr = new ShellSort();

        System.out.println("Inputted array: ");
        int[] array = new int[]{5, 4, 3, 2, 1};
        arr.showArray(array);

        //Going to sort array
        arr.shellSort(array);

        //Show sorted array
        System.out.println("Sorted array: ");
        arr.showArray(array);

    }
}
