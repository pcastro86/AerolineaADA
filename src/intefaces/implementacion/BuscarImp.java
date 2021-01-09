package intefaces.implementacion;

import intefaces.IBuscar;
import modelos.Pasajero;
import modelos.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class BuscarImp implements IBuscar {

    @Override
    public List<Vuelo> buscarVueloporDestino(List <Vuelo> vuelos, String destino) {
        List <Vuelo> listadoVuelos = new ArrayList<>();

        for(Vuelo vuelo : vuelos) {
            if(vuelo.getDestino().equals(destino)){
                listadoVuelos.add(vuelo);
            }
        }

        return listadoVuelos;
    }
}
