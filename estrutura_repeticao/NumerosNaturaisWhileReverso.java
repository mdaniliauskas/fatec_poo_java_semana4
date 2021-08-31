
//Escreva um programa que exibe os primeiros 100 números naturais.
//Usando o while - ordenação reversa

public class NumerosNaturaisWhileReverso {
    public static void main(String[] args) {
        int numerosNaturais = 100;
        System.out.println("\nNumeros naturais entre 100 e 0:\n");       
        while (numerosNaturais >= 0) {    
        System.out.print(numerosNaturais + " ");  
        numerosNaturais--;  
        }
    }
}
