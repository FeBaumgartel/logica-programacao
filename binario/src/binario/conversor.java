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
public class conversor {

    public static void main(String[] args) {
        String numero;
        int result = 0;
        while (1 == 1) {
            numero = JOptionPane.showInputDialog("Digite um número binário de 8 bit");

            if (numero.length() != 8) {
                System.out.println("ERRO");
                break;
            }

            if (Integer.parseInt(numero.charAt(0) + "") == 1) {
                result += 128;
            } else if (Integer.parseInt(numero.charAt(0) + "") != 0) {
                System.out.println("ERRO");
                break;
            }
            if (Integer.parseInt(numero.charAt(1) + "") == 1) {
                result += 64;
            } else if (Integer.parseInt(numero.charAt(1) + "") != 0) {
                System.out.println("ERRO");
                break;
            }
            if (Integer.parseInt(numero.charAt(2) + "") == 1) {
                result += 32;
            } else if (Integer.parseInt(numero.charAt(2) + "") != 0) {
                System.out.println("ERRO");
                break;
            }
            if (Integer.parseInt(numero.charAt(3) + "") == 1) {
                result += 16;
            } else if (Integer.parseInt(numero.charAt(3) + "") != 0) {
                System.out.println("ERRO");
                break;
            }
            if (Integer.parseInt(numero.charAt(4) + "") == 1) {
                result += 8;
            } else if (Integer.parseInt(numero.charAt(4) + "") != 0) {
                System.out.println("ERRO");
                break;
            }
            if (Integer.parseInt(numero.charAt(5) + "") == 1) {
                result += 4;
            } else if (Integer.parseInt(numero.charAt(5) + "") != 0) {
                System.out.println("ERRO");
                break;
            }
            if (Integer.parseInt(numero.charAt(6) + "") == 1) {
                result += 2;
            } else if (Integer.parseInt(numero.charAt(6) + "") != 0) {
                System.out.println("ERRO");
                break;
            }
            if (Integer.parseInt(numero.charAt(7) + "") == 1) {
                result += 1;
            } else if (Integer.parseInt(numero.charAt(7) + "") != 0) {
                System.out.println("ERRO");
                break;
            }
            System.out.println("decimal: " + result);
            break;
        }

    }
}
