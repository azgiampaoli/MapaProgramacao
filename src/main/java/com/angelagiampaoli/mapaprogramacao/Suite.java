package com.angelagiampaoli.mapaprogramacao;

public class Suite {
    
    protected int numero;
    protected String tipo;
    protected int capacidade;
    protected double valorDiaria;

    public Suite(int numero, String tipo, int capacidade, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valorDiaria = valorDiaria;
    }

    public void imprimirSuite(){
        System.out.println(this.getNumero());
        System.out.println(this.getTipo());
        System.out.println(this.getCapacidade());
        System.out.println(this.getValorDiaria());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    
    
}
