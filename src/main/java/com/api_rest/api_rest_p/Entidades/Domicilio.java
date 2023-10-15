package com.api_rest.api_rest_p.Entidades;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name="domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Domicilio extends EntidadBase{
    @Column(name="calle_domicilio")
    private String calleDomicilio;
    @Column(name="numero_domicilio")
    private int numeroDomicilio;
    @ManyToOne(optional=false)
    @JoinColumn(name="fk_localidadDomicilio")
    private Localidad localidadDomicilio;
}
