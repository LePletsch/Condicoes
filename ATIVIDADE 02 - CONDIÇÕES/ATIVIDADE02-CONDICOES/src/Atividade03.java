import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero = terminal.nextInt();

        int verificacaoParImpar = numero % 2;

        if (verificacaoParImpar == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Ímpar");
        }
    }
    }
