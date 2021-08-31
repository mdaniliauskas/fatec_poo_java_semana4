
//Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior,
//segundo a legislação brasileira.
//Utilizando operador ternário

import javax.swing.JOptionPane;

public class VerificaMaioridadeTernario {
    public static void main(String[] args) {
        int idadeLegal = 18;
        int idadeInformada;
        JOptionPane.showMessageDialog(null, "Vamos realizar uma verificacao de sua idade.");
        idadeInformada = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite sua idade: "));
        String maioridade;
        maioridade = idadeInformada >= idadeLegal ? "Voce possui maioridade legal." : "Voce nao possui maioridade legal.";        
        JOptionPane.showMessageDialog(null, maioridade);
    }
}
    