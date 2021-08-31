
//Escreva um programa que exibe os primeiros 100 números naturais.
//Usando o for - ordenação reversa

public class NumerosNaturaisForReverso {
    public static void main(String[] args) {
        int i;
        System.out.println("\nNumeros naturais entre 100 e 0:\n");       
        int vetorNaturais[] = new int[101];       
        for (i = 100; i >= 0; i--) {
            vetorNaturais[i] = i;
            System.out.print(vetorNaturais[i] + " ");
        }
    }
}
