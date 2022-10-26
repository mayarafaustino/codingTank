import java.math.BigDecimal;
import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Feira {

    private static int getInteger() {

        Scanner sc = new Scanner(System.in);

        try {
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

    private static String inputTexto() {
        Scanner sc = new Scanner(System.in);
        String inputFormatado =  tirarAcentos(sc.nextLine());
        return inputFormatado;
    }

    private static String[] pedeListaDeCompras () {

        System.out.println("Quantos itens tem sua lista de compras? ");
        int tamanho = getInteger();

        String[] listaCompras = new String[tamanho];
        System.out.println("Insira sua lista de compras:");
        for (int i = 0; i < listaCompras.length; i++) {
            listaCompras[i] = inputTexto();
        }
        return listaCompras;
    }

    private static void exibeLista(String[] lista) {
        for (String item : lista) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    public static String tirarAcentos(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }

    public static void main(String[] args) {

        String[] listaPromocao;
        listaPromocao = new String[]{"banana", "maca", "pessego", "laranja", "uva"};

        String[] listaCompras = pedeListaDeCompras();

        System.out.println("As mercadorias no seu carrinho são: ");
        exibeLista(listaCompras);

        int quantidadeDeItensIguais = 0;
        for (int i = 0; i < listaPromocao.length; i++) {
            for (int j = 0; j < listaCompras.length; j++) {
                if (listaPromocao[i].equalsIgnoreCase(listaCompras[j])) {
                    System.out.printf("%s está em promoção! %n", listaCompras[j]);
                    quantidadeDeItensIguais++;
                }
            }
        }
        BigDecimal gorjeta = new BigDecimal("0.00");
        double fracaoCorrespondente = (quantidadeDeItensIguais / (double)listaPromocao.length);
        if (fracaoCorrespondente >= 0.90) {
            gorjeta = new BigDecimal("10.00");
        } else if (fracaoCorrespondente >= 0.75) {
            gorjeta = new BigDecimal("5.00");
        } else if (fracaoCorrespondente >= 0.50) {
            gorjeta = new BigDecimal("3." +
                    "00");
        } else {
            System.out.println("Não dar gorjeta");
        }
        System.out.println("Gorjeta = R$" + gorjeta);
    }
}
