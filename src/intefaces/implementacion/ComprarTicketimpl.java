package intefaces.implementacion;

import intefaces.IComprarTicket;
import modelos.*;

public class ComprarTicketimpl implements IComprarTicket {


    @Override
    public Ticket ticketComprado(Aerolinea aerolinea, Pasajero pasajero, Vuelo vuelo, String categoriaAsiento) {

        Ticket ticket = new Ticket(aerolinea, pasajero,vuelo, categoriaAsiento );

        return ticket;
    }
}
