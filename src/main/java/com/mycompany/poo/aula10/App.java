package com.mycompany.poo.aula10;

public class App {
 public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    pessoa.nome = "Bruno";
    pessoa.idade = 17;
    // pessoa.salario = 5.000; atributos privados não são visíveis

    // Intanciando classes que estão declaradas em outros arquivos
    Pessoa pessoa1 = new Pessoa();
    Pessoa pessoa2 = new Pessoa();

    pessoa1.nome = "heloisa";
    pessoa1.idade = 11;
    pessoa1.altura = 1.40;

    pessoa2.nome = "Bruno";
    pessoa2.idade = 17;
    pessoa2.altura = 1.70;

    pessoa1.exibirdados();
    pessoa2.exibirdados();

    pessoa1.atribuirsalario(2000.0);
    pessoa2.atribuirsalario(3500);

   /*System.out.println("--- Dados da pessoa ---");
    System.out.println("Nome: " + pessoa1.nome);
    System.out.println("Idade: " + pessoa1.idade);
    System.out.println("Altura (m): " + pessoa1.altura);

    System.out.println("--- Dados da pessoa ---");
    System.out.println("Nome: " + pessoa2.nome);
    System.out.println("Idade: " + pessoa2.idade);
    System.out.println("Altura (m): " + pessoa2.altura);*/
 }   
}

