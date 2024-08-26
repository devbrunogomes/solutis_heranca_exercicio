
package solutis.heranca_exercicio;

public class Administrador extends Empregado {
    private double ajudaDeCusto;
    
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }     
    
    @Override
    public double calcularImposto() {
        //Calculo de imposto após somar a Ajuda de Custo
        this.impostoDevido = (getSalarioBase() + getAjudaDeCusto()) * 0.24;
        return this.impostoDevido;
    }
    
    @Override
    public void calcularSalario() {
        //(Salario base + Ajuda de Custo) - impostoDevido
        double salarioLiquido = (this.salarioBase + getAjudaDeCusto()) - this.calcularImposto();
        System.out.printf("Salario Liquido: R$%.2f", salarioLiquido);
    }
    
}
