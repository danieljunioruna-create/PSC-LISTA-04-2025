import java.util.Scanner;

public class ValidarUsuarioSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;

        while (true) {
            System.out.print("Digite o nome de usuário: ");
            usuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("a senha não pode ser igual ao nome de usuário!\n");
            } else {
                break; // sai do laço se estiver tudo certo
            }
        }

        System.out.println("adastro realizado com sucesso!");
        System.out.println("Usuário: " + usuario);
        sc.close();
    }
}