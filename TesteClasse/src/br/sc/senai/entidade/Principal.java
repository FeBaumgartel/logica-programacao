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
public class Principal {
    public static void main(String[] args) {
        /*Para acessar os métodos ou atributos de uma classe precisamos definir um Objeto.
        Será através dela que acessaremos os métodos e os atributos da classe*/
        
        /*Definindo o objeto cachorro*/
        Cachorro cachorro=new Cachorro();
        
        cachorro.latir();
        cachorro.correr();
        cachorro.morder();
        
        cachorro.Nome="Jozisclanisvelton";
        cachorro.Idade=34;
        cachorro.Raca="Vira-Lata";
        cachorro.Cor="Indefinido";
        cachorro.Peso=796;
        cachorro.Sexo="Indefinido";
        
        cachorro.imprimirdados();
    }
}
