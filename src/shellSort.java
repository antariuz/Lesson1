import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class shellSort {

    private ArrayList<Integer> shellSort(ArrayList<Integer> array){
        int gap = 2;
        for (int i = gap; i > 0; i--) {
            for (int j = i; j < array.size(); j++) {
                if (array.get(j) < array.get(j - i)) {
                    Collections.swap(array, j, j - i);
                }
                if (j == array.size() - 1) {
                    for (int k = array.size() - i - 1; k > 0; k = k - i) {
                        if (array.get(k - i) > array.get(k)) {
                            Collections.swap(array, k, k - i);
                        }
                    }
                }

            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList();
        System.out.println("Let's sort some array by the Shell Sort algorithm");
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
        shellSort shellSort = new shellSort();
        shellSort.shellSort(array);
        System.out.println("Sorted array:\n" + array);
    }
}