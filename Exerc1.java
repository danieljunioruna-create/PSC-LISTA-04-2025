import java.util.Scanner;

public class ValidarNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = -1;

        
        while (nota < 0 || nota > 10) {
            System.out.print("Digite uma nota entre 0 e 10: ");

            // Validação para evitar erro se o usuário digitar texto
            if (sc.hasNextDouble()) {
                nota = sc.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Valor inválido! A nota deve estar entre 0 e 10.\n");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número.\n");
                sc.next(); 
            }
        }

        System.out.println("Nota válida digitada: " + nota);
        sc.close();
    }
}