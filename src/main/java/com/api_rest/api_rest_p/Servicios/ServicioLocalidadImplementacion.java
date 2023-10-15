package com.api_rest.api_rest_p.Servicios;
import com.api_rest.api_rest_p.Entidades.Localidad;
import com.api_rest.api_rest_p.Entidades.Persona;
import com.api_rest.api_rest_p.Repositorios.RepositorioBase;
import com.api_rest.api_rest_p.Repositorios.RepositorioLocalidad;
import com.api_rest.api_rest_p.Repositorios.RepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioLocalidadImplementacion extends ServicioBaseImplementacion<Localidad,Long> implements ServicioLocalidad{
    @Autowired
    private RepositorioLocalidad repositorioLocalidad;

    public ServicioLocalidadImplementacion(RepositorioBase<Localidad,Long> repositorioBase,RepositorioLocalidad repositorioLocalidad){
        super(repositorioBase);
        this.repositorioLocalidad=repositorioLocalidad;
    }
}
