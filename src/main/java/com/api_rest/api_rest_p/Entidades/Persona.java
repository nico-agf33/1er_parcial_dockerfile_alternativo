package com.api_rest.api_rest_p.Entidades;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Persona extends EntidadBase{
    @Column(name="apellido_persona")
    private String apellidoPersona;
    @Column(name="nombre_persona")
    private String nombrePersona;
    @Column(name="dni_persona")
    private String dniPersona;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_domicilioPersona")
    private Domicilio domicilioPersona;
    @OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
    @JoinTable(name="libros_persona",joinColumns=@JoinColumn(name="id_persona"),inverseJoinColumns=@JoinColumn(name="id_libro"))
    private List<Libro> librosPersona=new ArrayList<Libro>();
}
