package modelos;

public class Avion {
    private int idAvion;
    private int capacidad;
    private String marca;

    public Avion(int idAvion, int capacidad, String marca) {
        this.idAvion = idAvion;
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "idAvion=" + idAvion +
                ", capacidad=" + capacidad +
                ", marca='" + marca + '\'' +
                '}';
    }
}
