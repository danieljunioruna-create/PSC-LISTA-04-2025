import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("\nNúmeros no intervalo entre " + n1 + " e " + n2 + ":");

        // Se o primeiro número for maior, o bloco fará a troca
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for (int i = n1 + 1; i < n2; i++) {
            System.out.print(i + " ");
        }

        if (Math.abs(n1 - n2) <= 1) {
            System.out.println(" (Não há números entre eles)");
        }

        sc.close();
    }
}