/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Calculadora {
    double  num1;
    double  num2;
    int     operacao;
    
    void digitacao(){
        this.num1=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        this.operacao=Integer.parseInt(JOptionPane.showInputDialog("Digite o código para a operação:\n1 - adição\n2 - subtração\n3 - divisão\n4 - multiplicação"));
        this.num2=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
    }
    void multiplicacao(){
        JOptionPane.showMessageDialog(null,num1*num2);
    }
    void divisao(){
        JOptionPane.showMessageDialog(null,num1/num2);
    }
    void adicao(){
        JOptionPane.showMessageDialog(null,num1+num2);
    }
    void subtracao(){
        JOptionPane.showMessageDialog(null,num1-num2);
    }
}
