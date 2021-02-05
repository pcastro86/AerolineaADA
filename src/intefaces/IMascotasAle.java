package intefaces;

import modelos.Aerolinea;
import modelos.MascotasAle;
import modelos.Pasajero;

public interface IMascotasAle {

    MascotasAle crearMascotasAle(Aerolinea aerolineas, Pasajero pasajeros);
}
