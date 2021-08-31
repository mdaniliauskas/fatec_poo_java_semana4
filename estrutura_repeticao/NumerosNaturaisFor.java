
//Escreva um programa que exibe os primeiros 100 números naturais.
//Usando o for

public class NumerosNaturaisFor {
    public static void main(String[] args) {
        int i;
        System.out.println("\nNumeros naturais entre 0 e 100:\n");    
        int vetorNaturais[] = new int[101];       
        for (i = 0; i < vetorNaturais.length; i++) {
            vetorNaturais[i] = i;
            System.out.print(vetorNaturais[i] + " ");
        }
    }
}
