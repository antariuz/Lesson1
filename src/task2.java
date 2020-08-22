import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Exponentiation of a number

public class task2 {

    private long power(int number, int powerValue) {
        if (powerValue == 1) {
            return number;
        } else {
            return number * power(number, powerValue - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Let's do some exponentiation of a number" + "\n" + "Please, enter a number: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.print("To what power should raise the number?" + "\n" + "Enter a number of power: ");
        int powerValue = Integer.parseInt(reader.readLine());
        task2 power = new task2();
        System.out.println("Here is the answer: " + number + "^" + powerValue + " = " + power.power(number,powerValue));
        while (true) {
            System.out.print("Do you want to power next number? (yes/no)" + "\n");
            String answer = reader.readLine();
            if (answer.equals("yes") || answer.equals("y") || answer.equals("YES") || answer.equals("Y")) {
                System.out.print("Let's power the next number." + "\n" + "Please, enter number: ");
                number = Integer.parseInt(reader.readLine());
                System.out.print("To what power should raise the number?" + "\n" + "Enter a number of power: ");
                powerValue = Integer.parseInt(reader.readLine());
                System.out.println("Here is the next answer: " + number + "^" + powerValue + " = " + power.power(number,powerValue));
            } else {
                System.out.println("Job is done!");
                break;
            }
        }
    }
}