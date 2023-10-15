package com.api_rest.api_rest_p.Repositorios;
import com.api_rest.api_rest_p.Entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RepositorioPersona extends RepositorioBase<Persona,Long>{
    //Anotación método de Query
    List<Persona> findByNombrePersonaContainingOrApellidoPersonaContaining(String nombrePersona,String apellidoPersona);
    Page<Persona> findByNombrePersonaContainingOrApellidoPersonaContaining(String nombrePersona,String apellidoPersona,Pageable pageable);

    //Anotación JPQL - Parámetros indexados
    @Query(value="SELECT p FROM Persona p WHERE p.nombrePersona LIKE %:filtro% OR p.apellidoPersona LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);
    @Query(value="SELECT p FROM Persona p WHERE p.nombrePersona LIKE %:filtro% OR p.apellidoPersona LIKE %:filtro%")
    Page<Persona> search(@Param("filtro") String filtro,Pageable pageable);

    //Query nativa
    @Query(value="SELECT * FROM persona WHERE persona.nombre_persona LIKE %:filtro% OR persona.apellido_persona LIKE %:filtro%",nativeQuery=true)
    List<Persona> searchNative(@Param("filtro") String filtro);
    @Query(value="SELECT * FROM persona WHERE persona.nombre_persona LIKE %:filtro% OR persona.apellido_persona LIKE %:filtro%",countQuery="SELECT count(*) FROM persona",nativeQuery=true)
    Page<Persona> searchNative(@Param("filtro") String filtro,Pageable pageable);
 }
