import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String[] args) {
        int numeroInserido = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, insira um número para calcular o seu fatorial: "));
        int i, fatorial = 1;
        for (i = 1; i <= numeroInserido; i++) {
            fatorial *= i; 
        }
        System.out.println(fatorial);
    }
}
