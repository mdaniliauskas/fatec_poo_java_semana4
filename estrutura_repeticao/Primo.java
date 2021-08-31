import javax.swing.JOptionPane;

public class Primo {
    public static void main(String[] args) {
        int numeroInserido = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que 1 para verificar se ele é primo: "));
        int i, verificaPrimo = 0;
        for (i = 2; i <= numeroInserido; i++){
            if (numeroInserido % i == 0) {
                verificaPrimo++;             
            }
        }        
        if (verificaPrimo > 1) { 
            JOptionPane.showMessageDialog(null, "O número informado, " + numeroInserido + ", não é primo.");            
        } 
        else {
            JOptionPane.showMessageDialog(null, "O número informado, " + numeroInserido + ", é primo.");
        }
    }
}
