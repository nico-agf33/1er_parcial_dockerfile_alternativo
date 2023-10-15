package com.api_rest.api_rest_p.Servicios;
import com.api_rest.api_rest_p.Entidades.EntidadBase;
import com.api_rest.api_rest_p.Repositorios.RepositorioBase;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.yaml.snakeyaml.events.Event;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class ServicioBaseImplementacion<E extends EntidadBase,Id extends Serializable> implements ServicioBase<E,Id>{
    protected RepositorioBase<E,Id> repositorioBase;

    public ServicioBaseImplementacion(RepositorioBase<E,Id> repositorioBase){
        this.repositorioBase=repositorioBase;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception{
        try{
            List<E> entities=repositorioBase.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception{
        try{
            Page<E> entities=repositorioBase.findAll(pageable);
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(Id id) throws Exception{
        try{
            Optional<E> entitiesOptional=repositorioBase.findById(id);
            return entitiesOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception{
        try{
            entity=repositorioBase.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(Id id,E entity) throws Exception{
        try{
            Optional<E> entityOptional=repositorioBase.findById(id);
            E ent=entityOptional.get();
            ent=repositorioBase.save(entity);
            return ent;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Id id) throws Exception{
        try{
            if(repositorioBase.existsById(id)){
                repositorioBase.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
