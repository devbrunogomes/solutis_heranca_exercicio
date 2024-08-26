/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package solutis.heranca_exercicio;

/**
 *
 * @author bsgom
 */
public class Heranca_Exercicio {

    public static void main(String[] args) {
        System.out.println("Exercicio 1 : ");
        Pessoa pessoa1 = new Pessoa("Bruno", "Cajazeiras 8", "911223344"); //Nova instacia de pessoa
        pessoa1.detalhes();    
        
        System.out.println("");
        System.out.println("Exercicio 2 : ");
        Fornecedor fornecedor1 = new Fornecedor("Pedro", "7199213687");
        fornecedor1.setValorCredito(2500); //valor de credito
        fornecedor1.getValorCredito();
        fornecedor1.setValorDivida(1150); //valor de divida
        fornecedor1.getValorDivida();
        fornecedor1.obterSaldo();

        System.out.println("");
        System.out.println("Exercicio 3 : ");        
        Empregado empregado1 = new Empregado("Joao", "Brotas", "71987198565", 5, 1557.80);
        empregado1.detalhes();
        empregado1.calcularSalario();

        System.out.println("\n");
        System.out.println("Exercicio 4 : ");        
        Administrador adm1 = new Administrador("Marcelo", "Pituba", "71999256532", 1, 2565, 127);
        adm1.detalhes();
        adm1.calcularSalario();
        
        System.out.println("\n");
        System.out.println("Exercicio 5 : ");        
        Operario operario1 = new Operario("Marcos", "Mussurunga", "71987253645", 3, 2100);
        operario1.detalhes();
        operario1.setValorProducao(20000);
        operario1.calcularSalario();
        
        System.out.println("\n");
        System.out.println("Exercicio 6 : ");        
        Vendedor vendedor1 = new Vendedor("Cristiano", "Liberdade", "7197898486", 2, 1800);
        vendedor1.detalhes();
        vendedor1.setValorVendas(10000);
        vendedor1.calcularSalario();
        
        
        
        
        
    }
}
