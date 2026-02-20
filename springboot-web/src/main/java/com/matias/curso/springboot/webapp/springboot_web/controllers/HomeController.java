package com.matias.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping({"","/home", "/"})
    public String home() {
        //El redirect debe comenzar con un '/' siempre, refresca la página
        return "forward:/app/list";
        //return "redirct:/app/list";

        /*
        La diferencia entre Forward y el redirect es que el forward se mantiene dentro de la misma peticcion HTTP y no se pierden los parametros que estan adentro del request, ademas de no generar un refresh a la pagina.
        Mientras que el redirect cambia la ruta url y reinicia la peticion HTTP refrescando el navegador perdiendo los parametros del request en un nuevo request.
        */
    }
    

}
