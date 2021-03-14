/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.Exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Principal {
    public static void main(String[] args) {
       Quadro quadro=new Quadro();
       Quadro quadro2=new Quadro();
       Quadro quadro3=new Quadro();
       
       quadro.lado=Double.parseDouble(JOptionPane.showInputDialog("Digite o lado"));
       quadro.area();
       quadro.perimetro();
       JOptionPane.showMessageDialog(null, "A área é: "+quadro.area+"\nO perímetro é: "+quadro.perimetro);
       
       
       quadro2.lado=Double.parseDouble(JOptionPane.showInputDialog("Digite o lado"));
       quadro2.area();
       quadro2.perimetro();
       JOptionPane.showMessageDialog(null, "A área é: "+quadro2.area+"\nO perímetro é: "+quadro2.perimetro);
       
       
       quadro3.lado=Double.parseDouble(JOptionPane.showInputDialog("Digite o lado"));
       quadro3.area();
       quadro3.perimetro();
       JOptionPane.showMessageDialog(null, "A área é: "+quadro3.area+"\nO perímetro é: "+quadro3.perimetro);
    }
}
