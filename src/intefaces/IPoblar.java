package intefaces;

import modelos.*;

import java.util.List;

public interface IPoblar {

    List <Aerolinea> crearAerolineas();

    List <Pasajero> crearPasajeros();

    List <Avion> crearAviones();

    // List <Ticket> crearTickets();

     List <Vuelo> crearVuelos();
}
