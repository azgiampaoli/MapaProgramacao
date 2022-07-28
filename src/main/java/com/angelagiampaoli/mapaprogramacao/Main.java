package com.angelagiampaoli.mapaprogramacao;

public class Main {
    public static void main(String[] args) {


    Suite suite = new Suite(12,"plus", 3 , 120.00);
    Suite suite1 = new Suite(13, "Standard", 1, 85.00);

    Hospede hosp = new Hospede();
    hosp.cadastrarHospedes();
    Hospede hosp1 = new Hospede();
    hosp1.cadastrarHospedes();
    Hospede hosp2 = new Hospede();
    hosp2.cadastrarHospedes();
 

    Reserva reserva = new Reserva(suite,10);

    reserva.hospede.add(hosp);
    reserva.hospede.add(hosp1);
    reserva.hospede.add(hosp2);
  




    System.out.println(reserva.calcularDiaria(suite,  false));

    }}
