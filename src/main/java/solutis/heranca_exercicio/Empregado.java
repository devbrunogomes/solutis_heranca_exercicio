
package solutis.heranca_exercicio;

public class Empregado extends Pessoa {
    private int codigoSetor;
    protected double salarioBase;
    protected double impostoDevido;
    
    
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
    }
    
    //Getter e Setters
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    protected double calcularImposto() {
        this.impostoDevido = getSalarioBase() * 0.24;
        return this.impostoDevido;
    }
    
    public void calcularSalario() {
        double salarioLiquido = this.salarioBase - this.calcularImposto();
        System.out.printf("Salario Liquido: R$%.2f", salarioLiquido);
    }
    
}
