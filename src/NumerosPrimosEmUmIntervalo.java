import java.util.Scanner;

public class NumerosPrimosEmUmIntervalo {

    static int[] PedeIntervaloAoUsuario () {

        int[] IntervaloSelecionado;
        IntervaloSelecionado = new int[2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Forneça dois números inteiros para definir o intervalo para a busca de números primos.");
        System.out.println("Limite inferior:");
        IntervaloSelecionado[0] = sc.nextInt();
        System.out.println("Limite superior:");
        IntervaloSelecionado[1] = sc.nextInt();

        return IntervaloSelecionado;

    }


    static boolean VerificaSeUmNumeroEhPrimo (int numero) {

        int quantidadeDivisores = 0;
        boolean ehPrimo;

        if (numero > 0) {
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    quantidadeDivisores++;
                }
            }
        } else if (numero < 0) {
            for (int i = -1; i >= numero; i--) {
                if (numero % i == 0) {
                    quantidadeDivisores++;
                }
            }
        } else {
            quantidadeDivisores = 0;
        }
        ehPrimo = quantidadeDivisores == 2;
        return ehPrimo;
    }


    static int QuantidadeDePrimosNoIntervalo (int minRange, int maxRange) {
        int quantidadeDePrimosNoIntervalo = 0;
        for (int i = minRange; i <= maxRange; i++) {
            if (VerificaSeUmNumeroEhPrimo(i)) {
                quantidadeDePrimosNoIntervalo++;
            }
        }
        return quantidadeDePrimosNoIntervalo;
    }


    static int[] ListaPrimosNoIntervalo (int minRange, int maxRange) {

        int quantidadeDePrimosNoIntervalo = QuantidadeDePrimosNoIntervalo(minRange, maxRange);
        int[] listaDePrimos;
        listaDePrimos = new int[quantidadeDePrimosNoIntervalo];

        int j = 0;
        for (int i = minRange; i <= maxRange; i++) {
            if (VerificaSeUmNumeroEhPrimo(i)){
                listaDePrimos[j] = i;
                j++;
            }
        }
        return listaDePrimos;
    }


    public static void main(String[] args) {

        int[] intervalo = PedeIntervaloAoUsuario();
        int minRange = intervalo[0];
        int maxRange = intervalo[1];


        System.out.print("Números primos no intervalo selecionado: ");
        for (int numero : ListaPrimosNoIntervalo(minRange, maxRange)) {
            System.out.print(numero + ", ");
        }



    }

}
