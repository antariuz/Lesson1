import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class doubleSelectionSort {

    private ArrayList<Integer> doubleSelectionSort(ArrayList<Integer> array){
        for (int i = 0, j = array.size() - 1; i < j; i++, j--) {
            int min = array.get(i), max = array.get(i);
            int minIndex = i, maxIndex = i;
            for (int k = i; k <= j; k++) {
                if (array.get(k) > max) {
                    max = array.get(k);
                    maxIndex = k;
                } else if (array.get(k) < min) {
                    min = array.get(k);
                    minIndex = k;
                }
            }
            Collections.swap(array, i, minIndex);
            if (array.get(minIndex) == max) {
                Collections.swap(array, j, minIndex);
            } else {
                Collections.swap(array, j, maxIndex);
            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList();
        System.out.println("Let's sort some array by the Double Selection Sort algorithm");
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
        doubleSelectionSort doubleSelectionSort = new doubleSelectionSort();
        doubleSelectionSort.doubleSelectionSort(array);
        System.out.println("Sorted array: \n" + array);
    }
}