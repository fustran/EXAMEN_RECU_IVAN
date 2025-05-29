package org.example;

public class AppParking {

    static Parking parking = new Parking("Alicante",1000, 0.10);

    public static void main(String[] args) {

        parking.generarClientesAleatorios();
        parking.mostrarClientesActuales();

        Ticket ticket = new Ticket("", 1, Estado.PENDIENTE);
        ticket.generar();
        gestionParking();

    }

    public static void gestionParking(){

        int plazas = parking.getPlazasTotales();
        int clientes = parking.getClientesActuales().size();
        int espacioLibre = 0;

        System.out.println("APP Parking");

        espacioLibre = plazas - clientes;

        System.out.println("Plazas libres " + espacioLibre);


    }
}