/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Principal {
    public static void main(String[] args) {
        int alt;
        
        Televisao televisao=new Televisao();
        do{
        alt=Integer.parseInt(JOptionPane.showInputDialog("0 - Sair\n1- Aumentar canal\n2 - Diminuir canal\n3 - Alterar canal\n4 - Aumentar volume\n5 - Diminuir volume\n6 - Imprimir canal e volume"));
        if(alt==1){
            televisao.aumentarcanal();
        }
        if(alt==2){
            televisao.diminuircanal();
        }
        if(alt==3){
            televisao.canal=Integer.parseInt(JOptionPane.showInputDialog("Digite o canal que deseja"));
        }
        if(alt==4){
            televisao.aumentarvol();
        }
        if(alt==5){
            televisao.diminuirvol();
        }
        if(alt==6){
            JOptionPane.showMessageDialog(null, "Você está no canal: "+televisao.canal+"\nVocê está com um volume de: "+televisao.vol);
        }
        }while(alt != 0);
    }
}