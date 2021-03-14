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
public class Principal {
    public static void main(String[] args) {
        Lampada lampada=new Lampada();
        int i;
        
        do{
        i=Integer.parseInt(JOptionPane.showInputDialog("0 - Sair\n1 - Ligar lâmpada\n2 - Desligar Lâmpada\n3 - Observar Lâmpada"));
        if(i==1){
            lampada.liga();
        }
        if(i==2){
            lampada.desliga();
        }
        if(i==3){
            lampada.observar();
        }
        }while(i!=0);
    }
}
