package co.edu.unicauca.saberpro.service;

import java.util.List;

import co.edu.unicauca.saberpro.model.Pregunta;
import co.edu.unicauca.saberpro.pipeline.ValidadorPipeline;
import co.edu.unicauca.saberpro.repository.IPreguntaRepository;

public class PreguntaServiceImpl implements IPreguntaService {

    private final IPreguntaRepository repository;
    private final ValidadorPipeline pipeline;

    public PreguntaServiceImpl(
            IPreguntaRepository repository,
            ValidadorPipeline pipeline) {

        this.repository = repository;
        this.pipeline = pipeline;
    }
    
// INTENCIONAL 3: El nombre del método no coincide con el definido en la interfaz IPreguntaService
// En la interfaz el método se llama 'registrarPregunta(Pregunta p)', pero aquí se utilizó 'guardarPregunta'.
// Por esta diferencia, el método no está implementando correctamente el de la interfaz.

//public boolean guardarPregunta(Pregunta pregunta) {
//    if (pipeline.ejecutar(pregunta)) {
//        return repository.guardar(pregunta);
//    }
//    return false;
//}


    @Override
    public boolean registrarPregunta(Pregunta pregunta) {

        if (pipeline.ejecutar(pregunta)) {
            return repository.guardar(pregunta);
        }

        return false;
    }

    @Override
    public List<Pregunta> obtenerTodas() {
        return repository.listar();
    }
}