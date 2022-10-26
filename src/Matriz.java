import java.util.Scanner;

public class Matriz {

    private static double getDouble() {

        Scanner sc = new Scanner(System.in);

        try {
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

        //3 turmas de 5 alunos
        double[][] notas = new double[3][5];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Acrescente a nota da turma " + (i + 1) + " aluno " + (j + 1) + ": ");
                notas[i][j] = getDouble();

            }

        }


        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}
