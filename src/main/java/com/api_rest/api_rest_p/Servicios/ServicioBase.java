package com.api_rest.api_rest_p.Servicios;
import com.api_rest.api_rest_p.Entidades.EntidadBase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.yaml.snakeyaml.events.Event;
import java.io.Serializable;
import java.util.List;

public interface ServicioBase<E extends EntidadBase,Id extends Serializable>{
    public List<E> findAll() throws Exception;
    public Page<E> findAll(Pageable pageable) throws Exception;
    public E findById(Id id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Id id,E entity) throws Exception;
    public boolean delete(Id id) throws Exception;
}
