import javax.swing.*;
import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Excolha uma operação (adição, subtração, multiplicação, divisão): ");
        String operacao = terminal.nextLine();
        System.out.println("Informe o primeiro valor: ");
        double numero1 = terminal.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double numero2 = terminal.nextDouble();

        if (operacao.equals("adição")){
            double soma = numero1 + numero2;
            System.out.println("Resultado: " + soma);
        }else if (operacao.equals("subtração")){
            double subtracao = numero1 - numero2;
            System.out.println("Resultado: " + subtracao);
        }else if (operacao.equals("multiplicação")){
            double multiplicacao = numero1 * numero2;
            System.out.println("Resultado: " + multiplicacao);
        } else if (operacao.equals("divisão")) {
            if(numero2 == 0){
                System.out.println("Segundo valor invalido!");
            } else {
                double divisao = numero1 / numero2;
                System.out.println("Resultado: " + divisao);
            }
        } else {
            System.out.println("Operação invalida!");
        }

    }
}