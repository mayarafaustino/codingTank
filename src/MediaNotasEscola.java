import java.util.Scanner;

public class MediaNotasEscola {

    private static int getInteger() {

        Scanner sc = new Scanner(System.in);

        while (true){
            try {
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
                System.out.println("O valor precisa ser um número inteiro ou decimal (ex: 56.8");
            } catch (Exception e) {
                System.out.println("Valor inválido.");
            }
        }
    }

    private static String PedirNomeTurma(int indice) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o nome da %d° turma: ", indice);
        String nomeDaTurma = sc.nextLine();

        return nomeDaTurma;
    }



    public static void main(String[] args) {

        System.out.println("Quantas turmas deseja listar?");
        int quantidadeDeTurmas = getInteger();

        String[] listaDeTurmas = new String[quantidadeDeTurmas];

        for (int i = 0; i < listaDeTurmas.length; i++) {
            listaDeTurmas[i] = PedirNomeTurma(i + 1);
        }


        int[] quantidadeDeAlunosEmCadaTurma = new int[quantidadeDeTurmas];

        int j = 0;
        for (String turma : listaDeTurmas) {
            System.out.printf("Quantos alunos tem na %s ?", turma );
            int quantidadeDeAlunos = getInteger();
            quantidadeDeAlunosEmCadaTurma[j] = quantidadeDeAlunos;
            j++;

        }


        double[][] notas;
        for (int i = 0; i < quantidadeDeTurmas; i++) {
            System.out.println(listaDeTurmas[i]);
            notas = new double[quantidadeDeTurmas][quantidadeDeAlunosEmCadaTurma[i]];

            for (int k = 0; k < quantidadeDeAlunosEmCadaTurma[i]; k++) {
                notas[i][k] = getDouble();
                System.out.println(notas[i][k]);
            }
        }



    }
}
