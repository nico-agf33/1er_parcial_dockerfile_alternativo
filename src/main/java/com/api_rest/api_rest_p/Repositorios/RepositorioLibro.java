package com.api_rest.api_rest_p.Repositorios;
import com.api_rest.api_rest_p.Entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLibro extends RepositorioBase<Libro,Long>{

}
