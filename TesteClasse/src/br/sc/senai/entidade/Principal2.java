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
public class Principal2 {
    public static void main(String[] args) {
        Cachorro cachorro=new Cachorro();
        
        cachorro.Nome="Elefantinho_Lindo";
        cachorro.Idade=666;
        cachorro.Peso=7;
        
        cachorro.imprimirdados();
    }
}
