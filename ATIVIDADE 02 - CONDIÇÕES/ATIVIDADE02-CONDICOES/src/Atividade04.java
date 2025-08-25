import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        String usuarioCorreto = "leticia";
        String senhaCorreta = "senha123";

        Scanner terminal = new Scanner(System.in);
        System.out.println("Usuário: ");
        String usuario = terminal.nextLine();
        System.out.println("Senha: ");
        String senha = terminal.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos!");
        }
    }
}