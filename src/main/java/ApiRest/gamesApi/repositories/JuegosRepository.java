package ApiRest.gamesApi.repositories;

import ApiRest.gamesApi.models.JuegosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface JuegosRepository extends JpaRepository<JuegosModel, Long> {
    public abstract ArrayList<JuegosModel> findByTituloNombre(String tituloNombre);

}
