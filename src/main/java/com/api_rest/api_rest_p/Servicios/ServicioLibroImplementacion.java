package com.api_rest.api_rest_p.Servicios;
import com.api_rest.api_rest_p.Entidades.Libro;
import com.api_rest.api_rest_p.Repositorios.RepositorioBase;
import com.api_rest.api_rest_p.Repositorios.RepositorioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioLibroImplementacion extends ServicioBaseImplementacion<Libro,Long> implements ServicioLibro{
    @Autowired
    private RepositorioLibro repositorioLibro;

    public ServicioLibroImplementacion(RepositorioBase<Libro,Long> repositorioBase,RepositorioLibro repositorioLibro) {
        super(repositorioBase);
        this.repositorioLibro=repositorioLibro;
    }
}
