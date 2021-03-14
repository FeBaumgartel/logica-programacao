/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Laço;

/**
 *
 * @author felipe_baumgartel
 */
public class ContadorWhile {
    public static void main(String [] args){
    int contador=0;
       
    while(contador<1000){
        contador++;
        System.out.println("valor: "+contador);
        }
    System.out.println("Finalizado!");
    }
}
