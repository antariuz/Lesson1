public class Exponentiation {

    private long power(int number, int powerValue) {

        return powerValue == 1 ? number : number * power(number, powerValue - 1);

    }

    public static void main(String[] args) {

        Exponentiation number = new Exponentiation();
        System.out.println(number.power(5,2));

    }
}
