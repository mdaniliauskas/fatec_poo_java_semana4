
//Escreva um programa que exibe os primeiros 100 números naturais.
//Usando do while com ordenação reversa

public class NumerosNaturaisDoWhileReverso {
    public static void main(String[] args) {
        int numerosNaturais = 100; 
        System.out.println("\nNumeros naturais entre 100 e 0:\n");              
        do {
            System.out.print(numerosNaturais + " "); 
            --numerosNaturais;
        } while (numerosNaturais >= 0);
    }
}
