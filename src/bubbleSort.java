import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class bubbleSort {

    private ArrayList<Integer> bubbleSort(ArrayList<Integer> array){
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - i - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, j + 1);
                    array.set(j + 1, temp);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList();
        System.out.println("Let's sort some array by the Bubble Sort algorithm");
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
        bubbleSort bubbleSort = new bubbleSort();
        bubbleSort.bubbleSort(array);
        System.out.println("Sorted array: \n" + array);
    }
}