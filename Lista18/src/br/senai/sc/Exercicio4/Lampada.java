/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Lampada {
    boolean ligada=false;
    
    void liga(){
        this.ligada=true;
    }
    void desliga(){
        this.ligada=false;
    }
    void observar(){
        if(ligada==false){
            JOptionPane.showMessageDialog(null, "A Lâmpada está desligada");
        }else
        if(ligada==true){
            JOptionPane.showMessageDialog(null, "A Lâmpada está ligada");
        }
    }
}
