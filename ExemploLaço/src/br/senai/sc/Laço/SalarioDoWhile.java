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
public class SalarioDoWhile {
    public static void main(String [] args){
        double salario;
        
        do{
            salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
        }while(salario != 0);
        
        while(salario!=0){
            salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
        }
    }
}

