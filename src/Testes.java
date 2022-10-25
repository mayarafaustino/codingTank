import java.time.LocalDateTime;

public class Testes {
    public static void main (String[] args) {


        // testando pré e pós fix
        //int i = 0;
        //System.out.println("pós: i++ = " + i++);
        //System.out.println(i);
        //int j = 0;
        //System.out.println("pré: ++j = " + ++j);


        //verificando se o número é par
        //int numero = 20;
        //int operacaoResto = numero % 2;

        //if (operacaoResto == 0){
           // System.out.println("número é par");
        //} else {
           // System.out.println(("número é ímpar"));
        //}



        //testando o format e os métodos de entrada

        //int idade = Integer.parseInt(args[1]);
        //System.out.printf("Oi %s, tudo bem? Eu tenho %d anos, e vc?%n", args[0], idade);

        String formatado = String.format("R$ %.2f", 2.0/3);
        System.out.println(formatado);
        LocalDateTime data = LocalDateTime.now();
        System.out.printf("%tM", data); //minutos

    }
}






