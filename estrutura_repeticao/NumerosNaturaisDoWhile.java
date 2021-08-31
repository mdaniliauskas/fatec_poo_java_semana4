public class NumerosNaturaisDoWhile {
    public static void main(String[] args) {
        int numerosNaturais = 0;
        
        do {
            System.out.print(numerosNaturais + " "); 
            ++numerosNaturais;
        } while (numerosNaturais <= 100);
    }
}
