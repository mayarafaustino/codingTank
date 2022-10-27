import java.util.Scanner;

public class Estudando {
    public static void main(String[] args) {

        //Temos um array de origem com 13 elementos do tipo char.
        // Desejamos obter uma cópia iniciando no elemento de índice 2 até (mas não incluindo) o índice 9.
        // O resultado vamos atribuir a um novo array com nome copyTo.
        // Para exibir o array resultante, vamos iniciar uma nova string com o conteúdo de copyTo
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo));


        int[] arrayDeInteiros = new int[5];
        arrayDeInteiros[0] = 10;

        //----------------------------------








    }
}
