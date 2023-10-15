package com.api_rest.api_rest_p.Controladores;
import com.api_rest.api_rest_p.Entidades.Localidad;
import com.api_rest.api_rest_p.Entidades.Persona;
import com.api_rest.api_rest_p.Servicios.ServicioLocalidadImplementacion;
import com.api_rest.api_rest_p.Servicios.ServicioPersonaImplementacion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/v3/localidades")
public class ControladorLocalidad extends ControladorBaseImplementacion<Localidad,ServicioLocalidadImplementacion>{

}
