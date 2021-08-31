import javax.swing.JOptionPane;

public class VerificaMaioridadeTernario {
    public static void main(String[] args) {
        int idadeLegal = 18;
        int idadeInformada;
        JOptionPane.showMessageDialog(null, "Vamos realizar uma verificação de sua idade.");
        idadeInformada = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite sua idade: "));
        String maioridade;
        maioridade = idadeInformada >= idadeLegal ? "Você possui maioridade legal." : "Você não possui maioridade legal.";        
        JOptionPane.showMessageDialog(null, maioridade);
    }
}
    