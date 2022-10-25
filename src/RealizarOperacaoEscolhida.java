import java.util.Scanner;

public class RealizarOperacaoEscolhida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a operação desejada. Opções: + , - , * ou / ");
        String operacao = sc.nextLine();

        System.out.println("Digite dois números para realizar a operação escolhida");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (operacao.equals("+")) {
            double soma = a + b;
            System.out.println(soma);
        } else if (operacao.equals("-")) {
            double subtracao = a - b;
            System.out.println(subtracao);
        } else if (operacao.equals("*")) {
            double multiplicacao = a * b;
            System.out.println(multiplicacao);
        } else if (operacao.equals("/")) {
            double divisao = a / b;
            System.out.println(divisao);
        } else {
            System.err.println("operação inválida");
        }

    }
}





// switch (operacao) {
//            case "+" :
//                double soma = a + b;
//                System.out.println(soma);
//                break;
//            case "-" :
//                double subtracao = a - b;
//                System.out.println(subtracao);
//                break;
//            case "*" :
//                double multiplicacao = a * b;
//                System.out.println(multiplicacao);
//                break;
//            case "/" :
//                double divisao = a / b;
//                System.out.println(divisao);
//                break;
//            default:
//                System.err.println("operação inválida");
//        }