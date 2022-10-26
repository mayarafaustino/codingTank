import java.math.BigDecimal;

public class testandoBigDecimal {

    public static void main(String[] args) {

        BigDecimal moeda1 = new BigDecimal("0.01");
        BigDecimal moeda5 = new BigDecimal("0.05");
        BigDecimal moeda10 = new BigDecimal("0.10");
        BigDecimal moeda25 = new BigDecimal("0.25");
        BigDecimal moeda50 = new BigDecimal("0.50");

        BigDecimal soma = moeda50.add(moeda25).add(moeda10);
        System.out.println(soma);
        System.out.println(soma.multiply(new BigDecimal("7")));
    }
}
