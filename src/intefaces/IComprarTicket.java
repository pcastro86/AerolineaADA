package intefaces;

import modelos.Aerolinea;
import modelos.Pasajero;
import modelos.Ticket;
import modelos.Vuelo;

public interface IComprarTicket {

    Ticket ticketComprado (Aerolinea aerolinea, Pasajero pasajero, Vuelo vuelo, String categoriaAsiento);
}
