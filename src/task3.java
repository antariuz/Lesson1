import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {

    private long factorial(int number) {
        if (number == 1) {
            return number;
        } else {
            return number * factorial(number - 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Let's calculate the factorial." + "\n" + "Please, enter a number of factorial: ");
        int number = Integer.parseInt(reader.readLine());
        task3 factorial = new task3();
        System.out.println("Here is the answer: " + number + "! = " + factorial.factorial(number));
        while (true) {
            System.out.print("Do you want to calculate next factorial? (yes/no)" + "\n");
            String answer = reader.readLine();
            if (answer.equals("yes") || answer.equals("y") || answer.equals("YES") || answer.equals("Y")) {
                System.out.print("Let's calculate the factorial." + "\n" + "Please, enter the next number: ");
                number = Integer.parseInt(reader.readLine());
                System.out.println("Here is the answer: " + number + "! = " + factorial.factorial(number));
            } else {
                System.out.println("Job is done!");
                break;
            }
        }
    }
}