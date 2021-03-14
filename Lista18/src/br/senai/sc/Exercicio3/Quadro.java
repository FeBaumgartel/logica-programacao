/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Exercicio3;

/**
 *
 * @author felipe_baumgartel
 */
public class Quadro {
    double lado, area, perimetro;
    
    void area(){
        this.area=this.lado*this.lado;
    }
    void perimetro(){
        this.perimetro=4*this.lado;
    }
}
