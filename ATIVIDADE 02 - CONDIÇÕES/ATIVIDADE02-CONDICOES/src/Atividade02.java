import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe sua nota: ");
        double nota = terminal.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Satisfatório");
        } else {
            System.out.println("Insatisfatório");
        }
    }
}