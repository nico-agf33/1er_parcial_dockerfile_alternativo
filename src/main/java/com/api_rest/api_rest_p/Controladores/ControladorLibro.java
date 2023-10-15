package com.api_rest.api_rest_p.Controladores;
import com.api_rest.api_rest_p.Entidades.Libro;
import com.api_rest.api_rest_p.Servicios.ServicioLibroImplementacion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/v3/libros")
public class ControladorLibro extends ControladorBaseImplementacion<Libro,ServicioLibroImplementacion>{

}
