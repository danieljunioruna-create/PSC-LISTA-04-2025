import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (;;) {
            long A = readLong(s, "População A: ");
            double rA = readRate(s, "Taxa A (%) : ");
            long B = readLong(s, "População B: ");
            double rB = readRate(s, "Taxa B (%) : ");

            if (A >= B) System.out.println("A >= B (0 anos)");
            else if (rA <= rB) System.out.println("A não alcançará B (taxaA <= taxaB)");
            else {
                int y = 0;
                double a = A, b = B;
                while (a < b && y < 10000) { a += a * rA; b += b * rB; y++; }
                if (y >= 10000) System.out.println("Limite de iterações atingido");
                else System.out.printf("Serão %d anos — A = %,d | B = %,d%n", y, Math.round(a), Math.round(b));
            }

            System.out.print("Repetir? (s/n): ");
            String r = s.nextLine().trim().toLowerCase();
            if (r.equals("n") || r.equals("nao") || r.equals("não") || r.equals("no")) break;
        }
    }

    static long readLong(Scanner s, String p) {
        for (;;) {
            System.out.print(p);
            try { return Long.parseLong(s.nextLine().trim()); }
            catch (Exception e) { System.out.println("Entrada inválida — digite um inteiro."); }
        }
    }

    static double readRate(Scanner s, String p) {
        for (;;) {
            System.out.print(p);
            try { return Double.parseDouble(s.nextLine().trim().replace(',', '.')) / 100.0; }
            catch (Exception e) { System.out.println("Entrada inválida — digite um número (ex: 2.5)."); }
        }
    }
}