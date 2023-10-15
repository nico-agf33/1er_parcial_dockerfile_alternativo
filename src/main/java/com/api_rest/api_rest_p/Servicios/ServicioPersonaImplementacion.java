package com.api_rest.api_rest_p.Servicios;
import com.api_rest.api_rest_p.Entidades.Persona;
import com.api_rest.api_rest_p.Repositorios.RepositorioBase;
import com.api_rest.api_rest_p.Repositorios.RepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPersonaImplementacion extends ServicioBaseImplementacion<Persona,Long> implements ServicioPersona{
    @Autowired
    private RepositorioPersona repositorioPersona;

    public ServicioPersonaImplementacion(RepositorioBase<Persona,Long> repositorioBase,RepositorioPersona repositorioPersona){
        super(repositorioBase);
        this.repositorioPersona=repositorioPersona;
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
              // List<Persona> personas=repositorioPersona.findByNombrePersonaContainingOrApellidoPersonaContaining(filtro,filtro);
              // List<Persona> personas=repositorioPersona.search(filtro);
                List<Persona> personas=repositorioPersona.searchNative(filtro);
                return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro,Pageable pageable) throws Exception {
        try{
            // Page<Persona> personas=repositorioPersona.findByNombrePersonaContainingOrApellidoPersonaContaining(filtro,filtro,pageable);
            // Page<Persona> personas=repositorioPersona.search(filtro,pageable);
            Page<Persona> personas=repositorioPersona.searchNative(filtro,pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
