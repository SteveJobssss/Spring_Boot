package com.tuempresa.tuaapi.controllers;

// Importa MessageSource para obtener mensajes localizados
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Librería para manejar opciones de lenguaje
import java.util.Locale;

// Define esta clase como un controlador REST
@RestController
// Define la URI base para los endpoints de saludo
@RequestMapping("/api")
public class SaludoController {

    // Inyecta una instancia de MessageSource
    @Autowired
    private MessageSource messageSource;

    // Endpoint para obtener un saludo en un idioma específico (HTTP GET)
    @GetMapping("/saludo")
    public String obtenerSaludo(@RequestParam(name = "lang", defaultValue = "en") String lang) {
        // Crea un objeto Local basado en el parámetro "lang" (ej.: "en", "es")
        Locale locale = new Locale(lang);
        // Obtiene el mensaje localizado usando el identificador "saludo"
        return messageSource.getMessage("saludo", null, locale);
    }
}