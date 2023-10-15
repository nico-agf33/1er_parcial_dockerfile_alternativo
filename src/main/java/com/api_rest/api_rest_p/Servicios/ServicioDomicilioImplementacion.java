package com.api_rest.api_rest_p.Servicios;
import com.api_rest.api_rest_p.Entidades.Domicilio;
import com.api_rest.api_rest_p.Repositorios.RepositorioBase;
import com.api_rest.api_rest_p.Repositorios.RepositorioDomicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServicioDomicilioImplementacion extends ServicioBaseImplementacion<Domicilio,Long> implements ServicioDomicilio{
    @Autowired
    private RepositorioDomicilio repositorioDomicilio;

    public ServicioDomicilioImplementacion(RepositorioBase<Domicilio,Long> repositorioBase,RepositorioDomicilio repositorioDomicilio) {
        super(repositorioBase);
        this.repositorioDomicilio=repositorioDomicilio;
    }
}
