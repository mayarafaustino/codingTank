public class ConversorTemperatura {
    public static void main (String[] args) {

        final double FATOR1 = 9D / 5;
        final int FATOR2 = 32;

        double celsius = 37.5;
        double fahrenheit = (celsius * FATOR1) + FATOR2;
        System.out.println(fahrenheit);

        celsius = 0;
        fahrenheit = (celsius * FATOR1) + FATOR2;
        System.out.println(fahrenheit);
    }
}
