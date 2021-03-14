/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Calculadora {
    double  num1;
    double  num2;
    double resultado;
    
    void multiplicacao(){
        this.resultado=this.num1*this.num2;
    }
    void divisao(){
        this.resultado=this.num1/this.num2;
    }
    void soma(){
        this.resultado=this.num1+this.num2;
    }
    void subtrai(){
        this.resultado=this.num1-this.num2;
    }
    void imprimeResultado(){
        JOptionPane.showMessageDialog(null, "O resultado é: "+this.resultado);
    }
}
