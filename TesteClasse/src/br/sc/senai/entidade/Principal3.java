/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sc.senai.entidade;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Principal3 {
    public static void main(String[] args) {
        Cachorro cachorro=new Cachorro();
        
        cachorro.Nome=JOptionPane.showInputDialog("Digite: Lobi");
        cachorro.Idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        cachorro.Peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
        
        cachorro.imprimirdados();
    }
}
