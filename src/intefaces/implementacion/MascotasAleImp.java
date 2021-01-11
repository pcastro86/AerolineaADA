package intefaces.implementacion;

import intefaces.IMascotasAle;
import modelos.Aerolinea;
import modelos.MascotasAle;
import modelos.Pasajero;

public class MascotasAleImp implements IMascotasAle {

    public MascotasAle crearMascotasAle(Aerolinea aerolineas, Pasajero pasajeros) {

       MascotasAle mascotasAle = new MascotasAle(aerolineas, pasajeros);

       return mascotasAle;
    }
}
