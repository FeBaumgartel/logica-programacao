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
public class ContadorDoWhile {
    public static void main(String [] args){
        
    int contador=0;
            
    do{
            contador++;
            System.out.println(contador);
        }while(contador < 1000);
    }
}
