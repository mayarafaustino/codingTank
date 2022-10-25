import java.util.Scanner;

public class ConversorPeso {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Forneça um peso em Quilograma");


        double pesoEmQuilo = sc.nextDouble();
        final double FATOR_CONVERSAO = 2.2D;
        double pesoEmLibras =  FATOR_CONVERSAO * pesoEmQuilo;
        System.out.println(pesoEmLibras);

    }
}
