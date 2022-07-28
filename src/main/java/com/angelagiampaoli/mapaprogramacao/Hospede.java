package com.angelagiampaoli.mapaprogramacao;


import java.util.Random;
import java.util.Scanner;

public class Hospede {

    protected int codigo;
    protected String nome;
    protected String endereco;
    protected int idade;
    int min_val = 0;
    int max_val = 1000;
    Random rand = new Random();
    int randomNum = min_val + rand.nextInt((max_val - min_val) + 1);

    public Hospede(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public Hospede() {
    }
    

    public void cadastrarHospedes(){
        this.setCodigo(randomNum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.setNome(sc.nextLine());
        System.out.println("digite o endereço: ");
        this.setEndereco(sc.nextLine());
        System.out.println("Digite a idade: ");
        this.setIdade(sc.nextInt());


    }

   public void imprimirHospede(){
       System.out.println("Código: " + this.getCodigo());
       System.out.println("Nome: " + this.getNome());
       System.out.println("Endereço: " + this.getEndereco());
       System.out.println("Idade: " + this.getIdade());

   }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
