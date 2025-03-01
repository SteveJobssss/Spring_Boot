package com.tuempresa.tuaapi.controllers;

// Importa la clase Producto y los componentes de Spring para controladores REST
import com.tuempresa.tuaapi.models.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Importa Flux, una librería Reactiva para manejar flujos de datos
import reactor.core.publisher.Flux;

// Define esta clase como un controlador REST
@RestController
// Define la URI base para las solicitudes HTTP de productos reactivos
@RequestMapping("/api/productos-reactivos")
public class ProductoReactivoController {

    // Endpoint para listar productos usando un flujo reactiva (HTTP GET)
    @GetMapping
    public Flux<Producto> listarProductos() {
        // Crea un flujo de productos con datos simulados
        return Flux.just(
                new Producto("1", "Laptop", 1200.0),
                new Producto("2", "Mouse", 25.0),
                new Producto("3", "Teclado", 45.0)
        );
    }
}