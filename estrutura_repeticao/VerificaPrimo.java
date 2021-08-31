
//Escreva um programa que verifica se um número natural digitado pelo usuário é
//primo.

import javax.swing.JOptionPane;

public class VerificaPrimo {
    public static void main(String[] args) {
        int numeroInserido = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que 1 para verificar se ele é primo ou  não: "));
        while (numeroInserido <= 0 || numeroInserido == 1) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número válido maior que 1!");      
            numeroInserido = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que 1 para verificar se ele é primo ou  não: "));     
        } 
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
