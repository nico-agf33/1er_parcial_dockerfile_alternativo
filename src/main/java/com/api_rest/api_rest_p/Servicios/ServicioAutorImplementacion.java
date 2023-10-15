package com.api_rest.api_rest_p.Servicios;
import com.api_rest.api_rest_p.Entidades.Autor;
import com.api_rest.api_rest_p.Repositorios.RepositorioAutor;
import com.api_rest.api_rest_p.Repositorios.RepositorioBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioAutorImplementacion extends ServicioBaseImplementacion<Autor,Long> implements ServicioAutor{
    @Autowired
    private RepositorioAutor repositorioAutor;

    public ServicioAutorImplementacion(RepositorioBase<Autor,Long> repositorioBase) {
        super(repositorioBase);
    }
}
