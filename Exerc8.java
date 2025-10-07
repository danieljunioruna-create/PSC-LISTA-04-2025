import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner Scanner = new Scanner(System.in);
        
        //DIGITANDO OS 5 NUMEROS QUE SERAO EXIBIDOS NA TELA
        
        System.out.print("Escreva o primeiro numero: ");
        double numero1 = Scanner.nextDouble();
        
        System.out.print("Escreva o segundo numero: ");
        double numero2 = Scanner.nextDouble();
        
        System.out.print("Escreva o terceiro numero: ");
        double numero3 =  Scanner.nextDouble();
          
        System.out.print("Escreva o quarto numero: ");
          double numero4 =  Scanner.nextDouble();
          
        System.out.print("Escreva o quinto numero: ");
        double numero5 =  Scanner.nextDouble();
        
        //calculando a soma dos 5 numeros
        
        double soma = (numero1 + numero2 + numero3 + numero4 + numero5);
        
        System.out.println("Resultado da soma dos 5 numeros digitados pelo usuario: " + soma + ",");
        
        double media = ((numero1 + numero2 + numero3 + numero4 + numero5)/ 5);
        System.out.println("Resultado da media dos 5 numeros digitados pelo usuario: " + media + ",");
        
        Scanner.close();
        
        
        
        
        
        
          
    }
}