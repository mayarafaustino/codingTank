import java.util.Scanner;

public class TratandoErroComWhile {

    private static int getInteger() {

        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Digite o valor desejado:");
                String input = sc.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("O valor precisa ser um número inteiro!");
            } catch (Exception e) {
                System.out.println("Valor inválido.");
            }
        }
    }



    private static double getDouble() {

        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Digite o valor desejado:");
                String input = sc.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("O valor precisa ser um número inteiro ou decimal (ex: 56.8)");
            } catch (Exception e) {
                System.out.println("Valor inválido.");
            }
        }
    }



    public static void main(String[] args) {

        int numeroInteiro = getInteger();
        System.out.println("Número inteiro = " + numeroInteiro);

        double numeroDecimal = getDouble();
        System.out.println("Número decimal = " + numeroDecimal);

    }
}

