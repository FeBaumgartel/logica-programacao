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
public class Principal {
    public static void main(String[] args) {
        int operacao;
        Calculadora calculadora=new Calculadora();
        Calculadora calculadora2=new Calculadora();
        
        calculadora.num1=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        operacao=Integer.parseInt(JOptionPane.showInputDialog("Digite o código para a operação:\n1 - soma\n2 - subtrai\n3 - divisão\n4 - multiplicação"));
        calculadora.num2=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        
        switch (operacao){
            case 1:{
                calculadora.soma();
                break;
            }
            case 2:{
                calculadora.subtrai();
                break;
            }
            case 3:{
                calculadora.divisao();
                break;
            }
            case 4:{
                calculadora.multiplicacao();
                break;
            }
        }
        calculadora.imprimeResultado();
        
        
        
        
        calculadora2.num1=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        operacao=Integer.parseInt(JOptionPane.showInputDialog("Digite o código para a operação:\n1 - soma\n2 - subtrai\n3 - divisão\n4 - multiplicação"));
        calculadora2.num2=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        
        switch (operacao){
            case 1:{
                calculadora2.soma();
                break;
            }
            case 2:{
                calculadora2.subtrai();
                break;
            }
            case 3:{
                calculadora2.divisao();
                break;
            }
            case 4:{
                calculadora2.multiplicacao();
                break;
            }
        }
        calculadora2.imprimeResultado();
    }
}
