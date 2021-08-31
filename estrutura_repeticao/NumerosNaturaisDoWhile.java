
//Escreva um programa que exibe os primeiros 100 números naturais.
//Usando do while

public class NumerosNaturaisDoWhile {
    public static void main(String[] args) {
        int numerosNaturais = 0; 
        System.out.println("\nNumeros naturais entre 0 e 100:\n");       
        do {
            System.out.print(numerosNaturais + " "); 
            ++numerosNaturais;
        } while (numerosNaturais <= 100);
    }
}
