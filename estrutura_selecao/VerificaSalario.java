import javax.swing.JOptionPane;

public class VerificaSalario {
    public static void main(String[] args) {
        float salarioMinimo = 1100;
        float salarioInformado;
        salarioInformado = Float.parseFloat(JOptionPane.showInputDialog("Por favor, digite o seu salário atual: "));
            if (salarioInformado >= salarioMinimo) {
            JOptionPane.showMessageDialog(null, "Você ganha pelo menos o salário mínimo.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Você está recebendo um valor abaixo do salário mínimo de R$ " + String.format("%.02f",salarioMinimo) + " !");

    }
}
