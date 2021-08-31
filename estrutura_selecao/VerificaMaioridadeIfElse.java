
//Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior,
//segundo a legislação brasileira.
//Utilizando if/else

import javax.swing.JOptionPane;

public class VerificaMaioridadeIfElse {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Vamos realizar uma verificacao de sua idade.");
        int idadeLegal = 18;
        int idadeInformada;
        idadeInformada = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite sua idade: "));
        if (idadeInformada >= idadeLegal) {
            JOptionPane.showMessageDialog(null, "Voce possui maioridade legal.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Voce nao possui maioridade legal.");
        }
    }
}
