public class Factorial {

    private long factorial(int number) {

        return number == 1 ? number : number * factorial(number - 1);

    }

    public static void main(String[] args) {

        Factorial number = new Factorial();
        System.out.println(number.factorial(5));

    }
}
