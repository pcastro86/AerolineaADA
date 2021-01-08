package intefaces;


import modelos.Vuelo;

import java.util.List;

public interface IBuscar {
    List<Vuelo> buscarVueloporDestino(List<Vuelo> vuelos, String destino);
}
