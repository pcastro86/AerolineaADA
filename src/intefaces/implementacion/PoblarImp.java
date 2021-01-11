package intefaces.implementacion;

import intefaces.IPoblar;
import modelos.Aerolinea;
import modelos.Avion;
import modelos.Pasajero;
import modelos.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class PoblarImp implements IPoblar {
    @Override
    public List<Aerolinea> crearAerolineas() {
        List <Aerolinea> listadeAerolineas = new ArrayList<>();

        Aerolinea latam = new Aerolinea("LATAM", true);
        Aerolinea ae = new Aerolinea("AEROLINEAS ARGENTINAS", false);

        listadeAerolineas.add(latam);
        listadeAerolineas.add(ae);

        return listadeAerolineas;
    }

    @Override
    public List<Pasajero> crearPasajeros() {
        List <Pasajero> listadePasajeros = new ArrayList<>();

        Pasajero pasa1 = new Pasajero("Pilar", "Castro", 33085669, true);
        Pasajero pasa2 = new Pasajero("Matias", "Ojea", 2029282,false);
        Pasajero pasa3 = new Pasajero("Gime", "Frand", 282282,true);

        listadePasajeros.add(pasa1);
        listadePasajeros.add(pasa2);
        listadePasajeros.add(pasa3);

        return listadePasajeros;
    }

    @Override
    public List<Avion> crearAviones() {
        List <Avion> listadeAviones = new ArrayList<>();

        Avion av1 = new Avion(001, 100, "Boing");
        listadeAviones.add(av1);
        return listadeAviones;
    }

    @Override
    public List<Vuelo> crearVuelos() {
        List<Vuelo> vuelos = new ArrayList<>();

        Vuelo vuelo = new Vuelo("22", "caba", "miami", "10:00", "12:00", "10:22", null);

        Vuelo vuelo1 = new Vuelo("23", "Mendonza", "Francia", "10:00", "12:00", "10:22", null);

        vuelos.add(vuelo);
        vuelos.add(vuelo1);
        return vuelos;
    }
}
