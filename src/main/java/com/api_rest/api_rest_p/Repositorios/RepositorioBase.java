package com.api_rest.api_rest_p.Repositorios;
import com.api_rest.api_rest_p.Entidades.EntidadBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import java.io.Serializable;

@NoRepositoryBean
public interface RepositorioBase<E extends EntidadBase,Id extends Serializable> extends JpaRepository<E,Id>{

}
