import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

    private void draw(int size) {
        int minSize = 3, realSize = size * minSize - size + 1, step = 0;
        String space = " ", star = "*";
//top part of Rombik
        for (int i = 1; i < realSize; i = i + 2) {
            for (int j = size - step; j > 0; j--) {
                System.out.print(space);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            for (int j = size - step; j > 0; j--) {
                System.out.print(space);
            }
            System.out.print("\n");
            step++;
        }
//middle part of Rombik
        for (int i = 0; i < realSize; i++) {
            System.out.print(star);
        }
        System.out.print("\n");
//bottom part of Rombik
        step = 0;
        for (int i = realSize - 2; i >= 1; i = i - 2) {
            for (int j = 0; j < 1 + step; j++) {
                System.out.print(space);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            for (int j = 0; j < 1 + step; j++) {
                System.out.print(space);
            }
            System.out.print("\n");
            step++;
        }
// end of the method
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Let's draw a rhombus." + "\n" + "Please, enter the size of the rhombus: ");
        int size = Integer.parseInt(reader.readLine());
        task1 rombik = new task1();
        rombik.draw(size);
        while (true) {
            System.out.print("Do you want to draw next one? (yes/no)" + "\n");
            String answer = reader.readLine();
            if (answer.equals("yes") || answer.equals("y") || answer.equals("YES") || answer.equals("Y")) {
                System.out.print("Let's draw the next rhombus." + "\n" + "Please, enter the size of the next rhombus: ");
                size = Integer.parseInt(reader.readLine());
                rombik.draw(size);
            } else {
                System.out.println("Job is done!");
                break;
            }
        }
    }
}