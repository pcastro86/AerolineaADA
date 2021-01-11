package modelos;

public class Ticket {
    private Aerolinea aerolinea;
    private Pasajero pasajero;
    private Vuelo vuelo;
    private String categoriaAsiento;
    private int precio1;

    public Ticket(Aerolinea aerolinea, Pasajero pasajero, Vuelo vuelo, String categoriaAsiento) {
        this.aerolinea = aerolinea;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.categoriaAsiento = categoriaAsiento;

    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getcategoriaAsiento() {
        return categoriaAsiento;
    }

    public void setcategoriaAsiento(String asiento) {
        this.categoriaAsiento = categoriaAsiento;
    }

    public int getPrecio1() {
        if(categoriaAsiento.equals("clase1")){
            precio1 = 50;
        }

        if(categoriaAsiento.equals("clase2")){
            precio1 = 40;
        }

        if(categoriaAsiento.equals("clase3")){
            precio1 = 30;

        }
        if(aerolinea.getNombreAerolinea().equals("LATAM")){
            precio1 = precio1 + 10;
        } else {
            precio1 = precio1 - 2;
        }
        return precio1;
    }

    public void setPrecio1(int precio1) {
        this.precio1 = precio1;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "aerolinea=" + aerolinea +
                ", pasajero=" + pasajero +
                ", vuelo=" + vuelo +
                ", asiento='" + categoriaAsiento + '\'' +
                ", precio=" + getPrecio1() +
                '}';
    }
}
