/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Calculadora;


/**
 *
 * @author felipe_baumgartel
 */
public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora();
        
        calculadora.digitacao();
        
        switch (calculadora.operacao){
            case 1:{
                calculadora.adicao();
                break;
            }
            case 2:{
                calculadora.subtracao();
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
    }
}