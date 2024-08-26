/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.heranca_exercicio;

/**
 *
 * @author bsgom
 */
public class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    //Construtor
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);

    }

    //Getters e Setters
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;

        this.calcularComissao(); //Após inserir um valor de producao, fazer o calculo de comissao

    }

    public double getComissao() {
        return comissao;
    }

    //Metodos     
    private void calcularComissao() {
        this.comissao = this.getValorProducao() * 0.02; //Comissao de 2%
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
