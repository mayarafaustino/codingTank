import java.util.Scanner;

public class TreinandoFuncao {
    public static void main(String[] args) {

        System.out.println(SomarDoisInteiros(PedirNumero(), PedirNumero()));

    }

    static int PedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        return sc.nextInt();
    }
    static int SomarDoisInteiros ( int a, int b) {
        return a + b;
    }
}
