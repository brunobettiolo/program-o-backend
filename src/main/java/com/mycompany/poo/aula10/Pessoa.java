package com.mycompany.poo.aula10;

public class Pessoa {
    /*
     * Modificadores de acesso
     * 
     * Quando trabalhamos com o conceito de POO, utilizamos modificadores de acesso,
     * para dar segurança
     * Para dar segurança a nossa classe.
     * 
     * Utilizamos elas como prefixo para:
     * -Classes
     * -Interface
     * -Atributos
     * -Métados
     */
    public String nome; // Publico, é visivel em qualquer classe.
    protected int idade; // Protegido, é visial somente em classes filhas (Herança)
    private double salario; // Privado, é visivel somente dentro da propria classe.
    double altura; // Friendly ou Publico, apesar não estar explicitado, ele tambem é visivel.

    public void exibirdados() {
        System.out.println("x:\"--- Dados da pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura (m): " + altura);

    }

    /*
     * Nomenclatura de métados
     * 
     * Métados/Funções indicam ações, e por padrão utilizamos verbos.
     * 
     * Ex: correr, andar, caminhar ...
     */
    public void atribuirsalario(double valor) {
        this.salario = valor;
        System.out.println("o novo salario de" + this.nome + " é " + this.salario);
    }
    public void atribuirsalario(double valor, double bonus) {
    this.salario = valor + bonus;
    System.out.println("O novo salario de " + this.nome + " e: " + this.salario + " mais um bonus de " + bonus);

    }
}