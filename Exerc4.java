public class crescimento {
    public static void main(String[] args) {
        
        int paisA = 80000;       // população inicial do país A
        int paisB = 200000;      
        double taxaA = 0.03;     
        int anos = 0;

        // Enquanto a população de A for menor que a de B,  ela continua crescendo
             while (paisA < paisB) {
                 paisA += paisA * taxaA;  // crescimento de A
                  paisB += paisB * taxaB;  // crescimento de B
                anos++;                  // conta os anos
        }

        System.out.println("✅ Serão necessários " + anos + " anos para que o país A ultrapasse ou iguale o país B.");
           System.out.println("População final do país A: " + paisA);
              System.out.println("População final do país B: " + paisB);
    }
}