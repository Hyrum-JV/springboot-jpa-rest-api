package ApiRest.gamesApi.controller;

import ApiRest.gamesApi.models.JuegosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ApiRest.gamesApi.service.JuegosService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/juegos")
public class JuegosController {

    @Autowired
    JuegosService juegosService;

    @GetMapping()
    public ArrayList<JuegosModel> obtenerJuegos(){
        return this.juegosService.obtenerJuegos();
    }

    @PostMapping()
    public JuegosModel guardarJuegos(@RequestBody JuegosModel juegos){
        return this.juegosService.guardarJuegos(juegos);
    }

    @PutMapping("/{id}")
    public JuegosModel actualizarJuego(
            @PathVariable Long id,
            @RequestBody JuegosModel juego) {

        return juegosService.actualizarJuego(id, juego);
    }

    @GetMapping(path = "/{id}")
    public Optional<JuegosModel> obtenerJuegoPorId(@PathVariable("id") Long id){
        return this.juegosService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<JuegosModel> obtenerJuegoPorTitulo (@RequestParam("tituloNombre") String titulo){
        return this.juegosService.obtenerPorTituloNombre(titulo);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.juegosService.eliminarJuego(id);
        if(ok)
            return "Se eliminó correctamente el juego con id: " + id;
        else
            return "No se pudo eliminar el usuario con id: " + id;
    }
}
