import java.util.Scanner;

public class MediaDeNotas {

    static double PedeNota () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do aluno ou '-1' para calcular a média com as notas fornecidas");
        return sc.nextDouble();
    }


    public static void main(String[] args) {

        double nota = PedeNota();
        double soma = 0;
        int totalDeNotas = 0;

        while (nota != -1) {

            while (nota < 0 || nota > 10) {
                System.err.println("A nota precisa estar entre 0 e 10!");
                nota = PedeNota();
            }

            soma += nota;
            totalDeNotas++;
            nota = PedeNota();

        }

        double resultado = soma / totalDeNotas;
        System.out.println("Média = " + resultado);

    }
}
