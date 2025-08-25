import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o salário bruto de um funcionário: ");
        double salarioBruto = terminal.nextDouble();
        System.out.println("Informe quantos anos o funcionário trabalhou na empresa: ");
        int anosTrabalhouEmpresa = terminal.nextInt();

        double bonus = 0;
        double imposto = 0;

        if (anosTrabalhouEmpresa > 10) {
            bonus = 0.10;

        } else if (anosTrabalhouEmpresa >= 5) {
            bonus = 0.05;

        }

        if (salarioBruto > 5000) {
            imposto = 0.27;

        } else if (salarioBruto >= 3000) {
            imposto = 0.18;

        } else {
            imposto = 0.10;
        }

        double valorImposto = salarioBruto * imposto;
        double valorBonus = salarioBruto * bonus;
        double salarioLiquido = salarioBruto - valorImposto + valorBonus;

        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Bônus recebido: " + valorBonus);
        System.out.println("Imposto descontado: " + valorImposto);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}