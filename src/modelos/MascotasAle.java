package modelos;

public class MascotasAle {

    private Aerolinea aerolinea;
    private Pasajero pasajero;
    private MascotasAle mascotasAle;

    public MascotasAle(Aerolinea aerolinea, Pasajero pasajero) {
        this.aerolinea = aerolinea;
        this.pasajero = pasajero;
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

    public boolean getMascotasAle() {
        boolean pasajeroViaja;
        if (aerolinea.isMascotas() && pasajero.isMascota()){
            pasajeroViaja = true;
            System.out.println("Buen viaje" + pasajero.getNombre()+", recuerde seguir las indicaciones para mayor seguridad de su mascota");
        }else{
            pasajeroViaja = false;
            System.out.println("Lo sentimos" + pasajero.getNombre()+", intente otra aerolinea que acepte mascotas");
        }
        return pasajeroViaja;
    }

    public void setMascotasAle(MascotasAle mascotasAle) {
        this.mascotasAle = mascotasAle;
    }


    @Override
    public String toString() {
        return "MascotasAle{" +
                "aerolinea=" + aerolinea +
                ", pasajero=" + pasajero +
                ", mascotasAle=" + mascotasAle + '\'' +
                '}';
    }

}
