
//Escreva um programa que calcula o fatorial de um valor natural digitado pelo
//usuário.

import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String[] args) {
        int numeroInserido = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira um numero natural e positivo para calcular o seu fatorial: "));
        int i, fatorial = 1;
        for (i = 1; i <= numeroInserido; i++) {
            fatorial *= i; 
        }
        JOptionPane.showMessageDialog(null, "Fatorial(" + numeroInserido + ") = " + fatorial);
    }
}
