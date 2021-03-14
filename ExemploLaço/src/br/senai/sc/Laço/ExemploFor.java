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
public class ExemploFor {
    public static void main(String[] args) {

    int i, x = 10;
        
        //Laço de repetição FOR
        for(i = 1; i <= 10; i++){
            
            if(i % 2 == 0)
                System.out.println("PAR");
            
            System.out.println(i);
        }
        
        for(int a = 10; a > 0; a = a - 2){
            System.out.println(a);
            
            
        }               
        
        for(int cont = 0; cont < 100; cont++)
            System.out.println(cont);
        
        System.out.println("depois do for");
        
        //For laço infinito
        /*for(;;){
            
        }*/
    }
}
