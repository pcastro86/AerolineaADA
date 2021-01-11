package main;

import intefaces.IComprarTicket;
import intefaces.IMascotasAle;
import intefaces.IPoblar;
import intefaces.implementacion.ComprarTicketimpl;
import intefaces.implementacion.MascotasAleImp;
import intefaces.implementacion.PoblarImp;
import modelos.*;

import java.util.List;

public class MainAle {
    public static void main(String[] args) {
        //System.out.println("Hola, soy Ale! :D");

        IPoblar poblar = new PoblarImp();

        List<Aerolinea> aerolineas = poblar.crearAerolineas();
        System.out.println(aerolineas);

        List <Pasajero> pasajeros = poblar.crearPasajeros();
        System.out.println(pasajeros);

        List <Avion> aviones = poblar.crearAviones();
        System.out.println(aviones);

        List <Vuelo> vuelos = poblar.crearVuelos();
        System.out.println(vuelos);

        Pasajero infoPasajero1 = pasajeros.get(0);
        System.out.println(infoPasajero1.getNombre() + ", mascota: " + infoPasajero1.isMascota());

        Pasajero infoPasajero2 = pasajeros.get(1);
        System.out.println(infoPasajero2.getNombre() + ", mascota: " + infoPasajero2.isMascota());

        Pasajero infoPasajero3 = pasajeros.get(2);
        System.out.println(infoPasajero3.getNombre() + ", mascota: " + infoPasajero3.isMascota());

        IMascotasAle pasajeroQueViaja = new MascotasAleImp();
        MascotasAle mascotasAle1 = pasajeroQueViaja.crearMascotasAle(aerolineas.get(0), pasajeros.get(0));

        System.out.println(mascotasAle1.getMascotasAle());


    }

}
