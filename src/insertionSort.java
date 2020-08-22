import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class insertionSort {

    private ArrayList<Integer> insertionSort(ArrayList<Integer> array){
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (array.get(i - j + 1) < array.get(i - j)) {
                    Collections.swap(array, i - j + 1, i - j);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList();
        System.out.println("Let's sort some array by the Insertion Sort algorithm");
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
        insertionSort insertionSort = new insertionSort();
        insertionSort.insertionSort(array);
        System.out.println("Sorted array: \n" + array);
    }
}