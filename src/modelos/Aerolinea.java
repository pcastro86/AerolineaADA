package modelos;

public class Aerolinea {
    private String nombreAerolinea;

    public Aerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    @Override
    public String toString() {
        return "Aerolinea{" +
                "nombreAerolinea='" + nombreAerolinea + '\'' +
                '}';
    }
}
