import java.util.Scanner;

public class SomarDoisNumerosRecebidos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Digite dois números");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double soma = x + y;
            System.out.println("Soma = " +  soma);
        } else if (args.length == 1) {
            System.out.println("Digite um número");
            double x = sc.nextDouble();
            double soma = x + Double.parseDouble(args[0]);
            System.out.println("Soma = " +  soma);
        } else if (args.length == 2) {
            double soma = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
            System.out.println("Soma = " +  soma);
        } else {
            System.err.println("quantidade de parâmetros inválida");
        }

    }
}

