package com.api_rest.api_rest_p.Controladores;
import com.api_rest.api_rest_p.Entidades.Domicilio;
import com.api_rest.api_rest_p.Servicios.ServicioDomicilioImplementacion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/v3/domicilios")
public class ControladorDomicilio extends ControladorBaseImplementacion<Domicilio,ServicioDomicilioImplementacion>{

}
