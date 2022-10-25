public class VerificaParidade {
    public static void main(String[] args) {

        System.out.println((Integer.parseInt(args[0]) % 2 == 0) ? "o número é par" : "o número é ímpar");

    }
}

//int numero = Integer.parseInt(args[0]);
//int resto = numero % 2;
//String resposta = (Integer.parseInt(args[0]) % 2 == 0)? "é par" : "é ímpar";
//String resposta = (resto == 0)? "é par" : "é ímpar";
//System.out.println(resposta);