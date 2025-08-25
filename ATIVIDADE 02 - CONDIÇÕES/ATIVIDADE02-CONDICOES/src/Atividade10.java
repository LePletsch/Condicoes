import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe o valor total da compra : ");
        double totalCompra = terminal.nextDouble();
        double descontoPercentual = 0;

        if (totalCompra > 500) {
            descontoPercentual = 0.20;

        } else if (totalCompra >= 200) {
            descontoPercentual = 0.10;

        }else if (totalCompra >= 100) {
            descontoPercentual = 0.05;

        }

        double valorDesconto = totalCompra * descontoPercentual;
        double valorFinalCompra = totalCompra - valorDesconto;

        System.out.println("Valor original da compra: " + totalCompra);
        System.out.println("Percentual de desconto aplicado: " + descontoPercentual);
        System.out.println("Valor descontado: " + valorDesconto);
        System.out.println("Valor total da compra: " + valorFinalCompra);
    }
}
