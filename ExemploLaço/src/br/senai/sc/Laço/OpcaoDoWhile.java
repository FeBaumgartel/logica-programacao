/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Laço;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class OpcaoDoWhile {
    public static void main(String [] args){
        
        int opcao;
        
        do{
            opcao=Integer.parseInt(JOptionPane.showInputDialog("1,2,3"));
            if(opcao<1||opcao>3){
                JOptionPane.showMessageDialog(null,"Opção errada, seu feio!");
            }
        }while(opcao < 1 || opcao > 3);
    }
}
