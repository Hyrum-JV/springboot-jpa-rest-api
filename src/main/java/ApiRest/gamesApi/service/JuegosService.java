package ApiRest.gamesApi.service;

import ApiRest.gamesApi.models.JuegosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ApiRest.gamesApi.repositories.JuegosRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JuegosService {

    @Autowired
    JuegosRepository juegosRepository;

    public ArrayList<JuegosModel> obtenerJuegos(){
        return (ArrayList<JuegosModel>) juegosRepository.findAll();
    }

    public JuegosModel guardarJuegos(JuegosModel juegos){
        return this.juegosRepository.save(juegos);
    }

    public JuegosModel actualizarJuego(Long id, JuegosModel juegoActualizado) {

        JuegosModel juegoExistente = juegosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Juego no encontrado"));

        juegoExistente.setTituloNombre(juegoActualizado.getTituloNombre());
        juegoExistente.setGenero(juegoActualizado.getGenero());
        juegoExistente.setPlataforma(juegoActualizado.getPlataforma());
        juegoExistente.setPrecio(juegoActualizado.getPrecio());

        return juegosRepository.save(juegoExistente);
    }

    public Optional<JuegosModel> obtenerPorId(Long id){
        return this.juegosRepository.findById(id);
    }

    public ArrayList<JuegosModel> obtenerPorTituloNombre(String titulo){
        return this.juegosRepository.findByTituloNombre(titulo);
    }

    public boolean eliminarJuego(Long id){
        try {
            juegosRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
