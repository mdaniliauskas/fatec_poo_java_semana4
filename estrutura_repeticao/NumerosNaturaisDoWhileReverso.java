public class NumerosNaturaisDoWhileReverso {
    public static void main(String[] args) {
        int numerosNaturais = 100;
        
        do {
            System.out.print(numerosNaturais + " "); 
            --numerosNaturais;
        } while (numerosNaturais >= 0);
    }
}
