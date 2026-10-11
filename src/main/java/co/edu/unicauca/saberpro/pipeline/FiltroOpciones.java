package co.edu.unicauca.saberpro.pipeline;

import co.edu.unicauca.saberpro.model.Pregunta;

public class FiltroOpciones implements IFiltroPregunta {

    @Override
    public boolean procesar(Pregunta pregunta) {

        if (pregunta == null || pregunta.getOpciones() == null) {
            return false;
        }

        
// ERROR  2: La condición para validar las opciones está invertida (HU03)
// La pregunta debe tener exactamente 4 opciones para que la validación sea correcta.
// En este caso, cuando tiene 4 opciones retorna false, cuando debería retornar true.
//if (pregunta.getOpciones().size() == 4) {
//    return false; // ERROR: Retorna false aunque tenga las 4 opciones.
//}
//return true;


        if (pregunta.getOpciones().size() == 4) {
            return true;
        }

        return false;
    }
}