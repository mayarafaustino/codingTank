import java.util.InputMismatchException;
import java.util.Scanner;

public class TratandoErro {

    static int getNumber(Scanner input) {
        try {
            System.out.println("Digite o valor desejado.");
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("O valor precisa ser um número inteiro");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    }
}


//    public static void main(String[] args) {
//        read(System.in);
//    }
//
//    public static Integer read(InputStream in) {
//
//        try {
//            Scanner scanner = new Scanner(in);
//            System.out.println("Teste");
//            return scanner.nextInt();
//        } catch (Exception e ) {
//            return read(in);
//        }
//
//    }
