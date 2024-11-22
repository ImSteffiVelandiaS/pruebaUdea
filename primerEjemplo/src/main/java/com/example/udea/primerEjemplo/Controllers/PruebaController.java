package com.example.udea.primerEjemplo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    //metodo saludar

    @GetMapping("/saludar")
    public String saludo(){
        return "Hola Campistas";
    }
    //metodo saludar a un campista
    @GetMapping("/saludar/{nombre}")
    public String saludoNombre(@PathVariable("nombre") String nombreCampista){
        return "Hola Campista "+ nombreCampista;
    }

    //Saludo con valores Request Param
    @GetMapping("saludoCompleto")
    public  String SaludoParametro(@RequestParam(value="nombre") String nombre,
                                   @RequestParam(value = "apellido", defaultValue = "UDEA")  String apellido){
        return " Hola Campista "+ nombre + " " + apellido;
    }


}
