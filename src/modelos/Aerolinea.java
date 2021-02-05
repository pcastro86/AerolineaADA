package modelos;

public class Aerolinea {
    private String nombreAerolinea;
    private boolean mascotas;

    public Aerolinea(String nombreAerolinea, boolean mascotas) {
        this.nombreAerolinea = nombreAerolinea;
        this.mascotas = mascotas;
    }

    public boolean isMascotas() {
        return mascotas;
    }

    public void setMascotas(boolean mascotas) {
        this.mascotas = mascotas;
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
                ", mascotas=" + mascotas +
                '}';
    }
}
