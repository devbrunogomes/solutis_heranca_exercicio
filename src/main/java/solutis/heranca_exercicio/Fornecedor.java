/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.heranca_exercicio;

/**
 *
 * @author bsgom
 */
public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;
    
    //Construtores
    public Fornecedor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }    

    public Fornecedor(String nome, String telefone) {
        super(nome, telefone);
    }
    
    //Getters e Setters
    public double getValorCredito() {
        System.out.printf("Valor de Credito de %s: R$%.2f\n", getNome(), this.valorCredito);
        return valorCredito;
    }

    public void setValorCredito(int valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        System.out.printf("Valor da divida de %s: R$%.2f\n", getNome(), this.valorDivida);
        return valorDivida;
    }

    public void setValorDivida(int valorDivida) {
        this.valorDivida = valorDivida;
    }   
    
    //Metodos
    public void obterSaldo() {
        double saldo = this.valorCredito - this.valorDivida;
        System.out.println("O valor do Saldo eh: R$" + saldo);
    }

}
