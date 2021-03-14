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
public class Cachorro {
    /*Definição atributos*/
    String  Nome;
    String  Cor;
    String  Raca;
    String  Sexo;
    int     Idade;
    double  Peso;
    
    /*Definição métodos*/
    void latir(){
        JOptionPane.showMessageDialog(null, "Au Au!");
    }
    void morder(){
        JOptionPane.showMessageDialog(null, "Você foi mordido!");
    }
    void correr(){
        JOptionPane.showMessageDialog(null, "Correndo!");
    }
    void imprimirdados(){
        JOptionPane.showMessageDialog(null, "Nome: "+this.Nome+"\nIdade: "+this.Idade+"\nPeso: "+this.Peso);
    }
}
