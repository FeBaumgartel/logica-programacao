/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class ContaCorrente {
    private String cpf;
    private String numConta;
    private double saldo;
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNumConta(String numConta){
        this.numConta=numConta;
    }
    public String getNumConta(){
        return this.numConta;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void sacar(double valor)
    {
        if(this.saldo>valor){
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        }else{
        this.saldo=this.saldo-valor;
        }
    }
    public void depositar(double valor)
    {
        this.saldo=this.saldo+valor;
    }
    public double consultarSaldo()
    {
        return this.saldo;
    }
}
