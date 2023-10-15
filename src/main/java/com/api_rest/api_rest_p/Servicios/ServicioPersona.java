package com.api_rest.api_rest_p.Servicios;
import com.api_rest.api_rest_p.Entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface ServicioPersona extends ServicioBase<Persona,Long>{
    List<Persona> search(String filtro) throws Exception;
    Page<Persona> search(String filtro,Pageable pageable) throws Exception;
}
