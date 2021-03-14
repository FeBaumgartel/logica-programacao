/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        
        cc.setCpf(JOptionPane.showInputDialog("CPF"));
        
        JOptionPane.showMessageDialog(null, "Você digitou o cpf: " + cc.getCpf() + "\nAbraço de foca!");
        
        cc.depositar(Double.parseDouble(JOptionPane.showInputDialog("Valor para depósito")));
    }
}
