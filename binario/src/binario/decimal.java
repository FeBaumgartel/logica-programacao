/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class decimal {

    public static void main(String[] args) {
        int numero;
        String result = "";
        while (1 == 1) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número decimal de 0 a 255"));

            if (numero < 0 || numero > 255) {
                System.out.println("ERRO");
                break;
            }

            if (numero >= 128) {
                result += "1";
                numero -= 128;
            } else {
                result += "0";
            }
            if (numero >= 64) {
                result += "1";
                numero -= 64;
            } else {
                result += "0";
            }
            if (numero >= 32) {
                result += "1";
                numero -= 32;
            } else {
                result += "0";
            }
            if (numero >= 16) {
                result += "1";
                numero -= 16;
            } else {
                result += "0";
            }
            if (numero >= 8) {
                result += "1";
                numero -= 8;
            } else {
                result += "0";
            }
            if (numero >= 4) {
                result += "1";
                numero -= 4;
            } else {
                result += "0";
            }
            if (numero >= 2) {
                result += "1";
                numero -= 2;
            } else {
                result += "0";
            }
            if (numero >= 1) {
                result += "1";
                numero -= 1;
            } else {
                result += "0";
            }
            System.out.println("binario: " + result);
            break;
        }
    }
}
