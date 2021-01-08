package modelos;

public class Ticket {
    private Aerolinea aerolinea;
    private Pasajero pasajero;
    private Vuelo vuelo;
    private String categoriaAsiento;
    private int precio;

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

    public int getPrecio() {
        if(categoriaAsiento.equals("clase1")){
            precio = 50;
        }

        if(categoriaAsiento.equals("clase2")){
            precio = 40;
        }

        if(categoriaAsiento.equals("clase3")){
            precio = 30;

        }
        if(aerolinea.getNombreAerolinea().equals("LATAM")){
            precio = precio + 10;
        } else {
            precio = precio - 2;
        }
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "aerolinea=" + aerolinea +
                ", pasajero=" + pasajero +
                ", vuelo=" + vuelo +
                ", asiento='" + categoriaAsiento + '\'' +
                ", precio=" + getPrecio() +
                '}';
    }
}
