package com.api_rest.api_rest_p.Entidades;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;
import java.util.List;

@Entity
@Table(name="libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Libro extends EntidadBase{
    @Column(name="fecha_libro")
    private int fechaLibro;
    @Column(name="genero_libro")
    private String generoLibro;
    @Column(name="paginas_libro")
    private int paginasLibro;
    @Column(name="titulo_libro")
    private String tituloLibro;
    @ManyToMany(cascade=CascadeType.REFRESH)
    private List<Autor> autoresLibro;
}
