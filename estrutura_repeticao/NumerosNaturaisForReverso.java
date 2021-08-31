
public class NumerosNaturaisForReverso {
    public static void main(String[] args) {
        int i;
        int vetorNaturais[] = new int[101];       
        for (i = 100; i >= 0; i--) {
            vetorNaturais[i] = i;
            System.out.print(vetorNaturais[i] + " ");
        }
    }
}
