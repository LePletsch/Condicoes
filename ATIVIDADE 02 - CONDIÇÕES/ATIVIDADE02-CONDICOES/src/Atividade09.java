import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe um número : ");
        double numero = terminal.nextDouble();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negativo");
        }
    }
}
