package com.angelagiampaoli.mapaprogramacao;

import java.util.ArrayList;
import java.util.Iterator;

public class Reserva {
    ArrayList<Hospede> hospede = new ArrayList<>();
    Suite suite;
    Hospede hosp;
    private int quantidadePessoas;
    private int quantidadeDias;
    private static boolean pagoAnterior = false;
    private static double valorTotal;


    public Reserva(Suite suite, int quantidadeDias) {
        this.suite = suite;
        this.quantidadeDias = quantidadeDias;
    }

    public boolean Capacidade(Suite suite) {
        Iterator<Hospede> itr = hospede.iterator();
        while (itr.hasNext()) {
            int aux = itr.next().getIdade();
            if (aux > 2) {
                this.setQuantidadePessoas(getQuantidadePessoas() + 1);
            }}
          if (this.getQuantidadePessoas() < suite.getCapacidade()){
          return true;}
          return false;

    }


    public double calcularDiaria(Suite suite, boolean pago) {
        this.setPagoAnterior(pago);
        double valor = this.getQuantidadeDias() * suite.getValorDiaria();

        if (!this.Capacidade(suite)) {
            System.out.println("Não há espaço suficiente nesta suite");

        } else if (this.isPagoAnterior() && this.getQuantidadeDias() >= 7) {

            valorTotal = valor - (valor * 0.1);
        } else {

            valorTotal = valor;
        }


            return valorTotal;
        }


    public ArrayList<Hospede> getHospede() {
        return hospede;
    }

    public void setHospede(ArrayList<Hospede> hospede) {
        this.hospede = hospede;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public boolean isPagoAnterior() {
        return pagoAnterior;
    }

    public void setPagoAnterior(boolean pagoAnterior) {
        this.pagoAnterior = pagoAnterior;
    }



}
