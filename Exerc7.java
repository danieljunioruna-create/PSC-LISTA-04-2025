import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // SO PARA LEMBRAR AO O USUARIO QUE SC É SCANNER
        
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE; // FUNÇAO QUE COMEÇA COM O MENOR VALOR POSSIVEL

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + " numero: ");
            int num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println(" maior número informado foi: " + maior);
        
        
        sc.close();
    }
}