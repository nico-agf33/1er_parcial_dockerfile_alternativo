package com.api_rest.api_rest_p.Controladores;
import com.api_rest.api_rest_p.Entidades.Autor;
import com.api_rest.api_rest_p.Servicios.ServicioAutorImplementacion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/v3/autores")
public class ControladorAutor extends ControladorBaseImplementacion<Autor,ServicioAutorImplementacion>{

}
