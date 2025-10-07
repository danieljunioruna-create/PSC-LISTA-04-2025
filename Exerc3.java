import java.util.Scanner;

public class ValidarInformacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        // Nome: maior que 3 caracteres
        while (true) {
          System.out.print("Digite seu nome: ");
          nome = sc.nextLine();
        if (nome.length() > 3) {
                break;
       } else {
                System.out.println(" nome deve ter mais de 3 caracteres.\n");
            }
        }

        // Idade: entre 0 e 150
        while (true) {
          System.out.print("Digite sua idade: ");
          if (sc.hasNextInt()) {
          idade = sc.nextInt();
          if (idade >= 0 && idade <= 150) {
           break;
          } else {
         System.out.println("Idade inválida! Deve estar entre 0 e 150.\n");
           }
         } else {
         System.out.println("Entrada inválida! Digite apenas números.\n");
         sc.next(); // limpa a entrada incorreta
            }
        }

        // Salário: maior que zero
        while (true) {
        System.out.print("Digite seu salário: ");
      if (sc.hasNextDouble()) {
         salario = sc.nextDouble();
          if (salario > 0) {
           break;
          } else {
            System.out.println("O salário deve ser maior que zero.\n");
          }
        } else {
                System.out.println("Entrada inválida! Digite um número.\n");
                sc.next(); // limpa o buffer
            }
        }

        sc.nextLine(); // limpa o buffer de quebra de linha

        // Sexo: 'f' ou 'm'
        while (true) {
            System.out.print("Digite seu sexo (f/m): ");
            String entradaSexo = sc.nextLine().toLowerCase();
            if (entradaSexo.equals("f") || entradaSexo.equals("m")) {
                sexo = entradaSexo.charAt(0);
                break;
            } else {
                System.out.println(" Sexo inválido! Digite 'f' para feminino ou 'm' para masculino.\n");
            }
        }

    
        while (true) {
            System.out.print("Digite seu estado civil (s - solteiro, c - casado, v - viúvo, d - divorciado): ");
            String entradaEstado = sc.nextLine().toLowerCase();
            if (entradaEstado.matches("[scvd]")) {
                estadoCivil = entradaEstado.charAt(0);
                break;
            } else {
                System.out.println("Estado civil inválido! Digite apenas s, c, v ou d.\n");
            }
        }

        // Exibição fina
        System.out.println("\ndos validados com sucesso!");
        System.out.println("-----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: " + estadoCivil);

        sc.close();
    }
}