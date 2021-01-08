package main;

import intefaces.IBuscar;
import intefaces.IPoblar;
import intefaces.implementacion.BuscarImp;
import intefaces.implementacion.PoblarImp;
import modelos.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPoblar poblar = new PoblarImp();
        List<Aerolinea> aerolineas = poblar.crearAerolineas();
        System.out.println(aerolineas);

        List <Pasajero> pasajeros = poblar.crearPasajeros();
        System.out.println(pasajeros);

        List <Avion> aviones = poblar.crearAviones();
        System.out.println(aviones);

        List <Vuelo> vuelos = poblar.crearVuelos();
        System.out.println(vuelos);

        IBuscar buscar = new BuscarImp();
        buscar.buscarVueloporDestino(vuelos, "Miami");

        Pasajero pasajeroQueCompra = pasajeros.get(0);
       // System.out.println( pasajeroQueCompra.comprarTicket(aerolineas.get(1), vuelos.get(0), "clase2"));

        Ticket t1 = pasajeroQueCompra.comprarTicket(aerolineas.get(1), vuelos.get(0), "clase2");
        System.out.println(t1);

        Ticket t2 = pasajeroQueCompra.cambiarVuelo(t1, vuelos.get(1));

        System.out.println(t2);



    }
}
