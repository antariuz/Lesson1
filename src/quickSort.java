import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class quickSort {

    private ArrayList<Integer> quickSort(ArrayList<Integer> array){
        //setting the Pivot position
        int pivot = array.get(array.size() - 1);
        int pivotIndex = array.size() - 1;
        int minIndex = 0;
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) <= array.get(pivotIndex)) {
                Collections.swap(array, i, minIndex);
                minIndex++;
            }
        }
        int mainPivotIndex = array.size() - 1;
        if (minIndex != 0) {
            mainPivotIndex = minIndex;
        }
        Collections.swap(array, array.size() - 1, mainPivotIndex);

        //Quick sort in the left side of the main Pivot
        for (int i = 0; i < mainPivotIndex - 1; i++) {
            int leftPivot = array.get(mainPivotIndex - i - 1);
            for (int j = 0; j < mainPivotIndex - 1; j++) {
                if (array.get(j) > leftPivot) {
                    Collections.swap(array, j, mainPivotIndex - j);
                }
            }
        }

        //Quick sort in the right side of the main Pivot
        for (int i = mainPivotIndex + 1; i < array.size() - 1; i++) {
            int rightPivot = array.get(array.size() - 1);
            for (int j = mainPivotIndex + 1; j < array.size() - 1; j++) {
                if (array.get(j) > rightPivot) {
                    Collections.swap(array, j, array.size() - 1);
                    System.out.println(array);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList();
        System.out.println("Let's sort some array by the Quick Sort algorithm");
        System.out.println("Please, fill the array number by number");
        System.out.println("Enter \"end\" word to finish filling the array");
        System.out.print("Please, enter the first number of the array: ");
        array.add(Integer.parseInt(reader.readLine()));
        while (true) {
            System.out.print("Please, enter the next one: ");
            String answer = reader.readLine();
            if (answer.equals("end") || answer.equals("END")) {
                System.out.println("Inputted array\n" + array);
                break;
            } else {
                array.add(Integer.parseInt(answer));
            }
        }
        quickSort quickSort = new quickSort();
        quickSort.quickSort(array);
        System.out.println("Sorted array:\n" + array);
    }
}