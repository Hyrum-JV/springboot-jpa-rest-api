package ApiRest.gamesApi.models;
import jakarta.persistence.*;

@Entity
@Table(name = "juegos")
public class JuegosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String tituloNombre;
    private String genero;
    private String plataforma;
    private Double precio;

    public Long getId() {
        return id;
    }

    public String getTituloNombre() {
        return tituloNombre;
    }

    public void setTituloNombre(String tituloNombre) {
        this.tituloNombre = tituloNombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
