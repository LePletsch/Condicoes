import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe uma temperatura em graus Celsius: ");
        double temperatura = terminal.nextDouble();

        if (temperatura > 30) {
            System.out.println("Quente");
        } else if (temperatura >= 15) {
            System.out.println("Agradável");
        } else {
            System.out.println("Frio");
        }
    }
}