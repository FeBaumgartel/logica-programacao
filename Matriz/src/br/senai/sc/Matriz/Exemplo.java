/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Matriz;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Exemplo {
    public static void main(String[]args){
        
        int[][]matriz=new int [2][3];
        double[][]peso=new double [2][3];
        String[][]nome=new String [2][3];
        int linha, coluna;
        
        for(linha=0;linha<2;linha++){
            for(coluna=0;coluna<3;coluna++){
                matriz[linha][coluna]=Integer.parseInt(JOptionPane.showInputDialog("Número"));
            }
        }
    }
}
