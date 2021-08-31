
//Escreva um programa que obtém o salário de uma pessoa e diz se ela está ganhando
//pelo menos o salário mínimo.

import javax.swing.JOptionPane;

public class VerificaSalario {
    public static void main(String[] args) {
        float salarioMinimo = 1100;
        float salarioInformado;
        JOptionPane.showMessageDialog(null, "Verificacao de ganhos de pelo menos um salario minimo.");
        salarioInformado = Float.parseFloat(JOptionPane.showInputDialog("Por favor, digite o seu salário atual em R$: "));
            if (salarioInformado >= salarioMinimo) {
            JOptionPane.showMessageDialog(null, "Voce ganha pelo menos o salerio minimo.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Voce esta recebendo um valor abaixo do salario minimo de R$ " + String.format("%.02f",salarioMinimo) + " !");
        }
    }
}
