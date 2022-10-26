import java.util.Scanner;

public class TratandoErroComRecursividade {

    private static int getInteger() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o valor desejado:");
            String input = sc.nextLine();
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("O valor precisa ser um número inteiro!");
            return getInteger();
        } catch (Exception e) {
            System.out.println("Valor inválido.");
            return getInteger();
        }

    }

    private static double getDouble() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o valor desejado:");
            String input = sc.nextLine();
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("O valor precisa ser um número inteiro ou decimal (ex: 56.8)");
            return getDouble();
        } catch (Exception e) {
            System.out.println("Valor inválido.");
            return getDouble();
        }

    }


    public static void main(String[] args) {
        System.out.println(getInteger());
        System.out.println(getDouble());
    }

}
