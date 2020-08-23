public class Rhombus {

    private void draw(int size) {

        int minSize = 3, realSize = size * minSize - size + 1, step = 0;
        String space = " ", star = "*";

        //top part of rhombus
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

    public static void main(String[] args) {

        Rhombus rhombus = new Rhombus();
        rhombus.draw(5);

    }
}
