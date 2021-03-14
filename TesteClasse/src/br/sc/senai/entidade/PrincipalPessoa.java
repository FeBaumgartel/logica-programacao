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
public class PrincipalPessoa {
    static Pessoa[] pessoa = new Pessoa[10];

    public static void main(String[] args) {
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar Pessoa"
                    + "\n2-Alterar Pessoa"
                    + "\n3-Excluir Pessoa"
                    + "\n4-Listar Pessoa"));

            if (op == 1) { //Cadastrar Cliente
                cadastrarPessoa();
            }

            if (op == 2) {
                alterarPessoa();
            }

            if (op == 3) {
                excluirPessoa();
            }

            if (op == 4) {
                imprimirPessoa();
            }

        } while (op != 0);
    }

    static void cadastrarPessoa() {
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i] == null) {
                pessoa[i] = new Pessoa();

                pessoa[i].setNome(JOptionPane.showInputDialog("Informe o nome"));
                pessoa[i].setIdade(Integer.parseInt(
                        JOptionPane.showInputDialog("Informe a idade")));

                break;
            }
        }
    }

    static void alterarPessoa() {
        int nabo;

        nabo = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código da pessoa para alterar"));
        
        nabo -= 1;
        
        if (pessoa[nabo] == null) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada");
        } else {
            pessoa[nabo].setNome(JOptionPane.showInputDialog("Informe o nome"));
            pessoa[nabo].setIdade(Integer.parseInt(
                    JOptionPane.showInputDialog("Informe a idade")));
        }

    }

    static void excluirPessoa() {
        int ronaldo;

        ronaldo = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código da pessoa para excluir"));

        ronaldo -= 1;

        if (pessoa[ronaldo] == null) {
            JOptionPane.showMessageDialog(null, "Pessoa não cadastrada");
        } else {
            pessoa[ronaldo] = null;
            JOptionPane.showMessageDialog(null, "Pessoa Excluída");
        }
    }

    static void imprimirPessoa() {
        String imp = "Lista de Cliente Cadastrados\n\n";

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i] != null) {
                imp += (i + 1) + " - " + pessoa[i].getNome() + " - "
                        + pessoa[i].getIdade() + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, imp);
    }
}
