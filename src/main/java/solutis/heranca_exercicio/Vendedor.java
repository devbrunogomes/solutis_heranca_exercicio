/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.heranca_exercicio;

/**
 *
 * @author bsgom
 */
public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    //Construtor
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
    }

    //Getter e Setters
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;

        this.calcularComissao();
    }

    public double getComissao() {
        return comissao;
    }
        

    //Metodos     
    private void calcularComissao() {
        this.comissao = this.getValorVendas() * 0.02; //Comissao de 2%
    }

    @Override
    protected double calcularImposto() {
        //Calculo de imposto após somar a comissao
        this.impostoDevido = (getSalarioBase() + getComissao()) * 0.24;
        return this.impostoDevido;
    }

    @Override
    public void calcularSalario() {
        //Salario Liquido = (Salario base + comissao) - impostoDevido
        double salarioLiquido = (this.salarioBase + getComissao()) - this.calcularImposto();

        System.out.printf("Salario Liquido: R$%.2f", salarioLiquido);
    }

}
