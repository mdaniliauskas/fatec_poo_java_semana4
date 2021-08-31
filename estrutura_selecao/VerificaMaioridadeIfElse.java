import javax.swing.JOptionPane;

public class VerificaMaioridadeIfElse {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Vamos realizar uma verificação de sua idade.");
        int idadeLegal = 18;
        int idadeInformada;
        idadeInformada = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite sua idade: "));
        if (idadeInformada >= idadeLegal) {
            JOptionPane.showMessageDialog(null, "Você possui maioridade legal.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Você não possui maioridade legal.");
        }
    }
}
