package com.tuempresa.tuaapi.tests;

// Importa las clases necesarias para pruebas de integración
import com.tuempresa.tuaapi.controllers.ProductoReactivoController;
import com.tuempresa.tuaapi.models.Producto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// Importa utilidades de testeo reactivos
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

// Configura las pruebas de integración con Spring Boot
@SpringBootTest
public class ProductoControllerTest {

    // Inyecta la instancia del controlador para pruebas
    @Autowired
    private ProductoReactivoController productoReactivoController;

    // Prueba para verificar la lista de productos reactivos
    @Test
    public void testListarProductos() {
        // Obtiene el flujo de productos desde el controlador
        Flux<Producto> productos = productoReactivoController.listarProductos();

        // Verifica los productos en el flujo usando StepVerifier
        StepVerifier.create(productos)
                .expectNextMatches(p -> p.getNombre().equals("Laptop"))  // Verifica el primer producto
                .expectNextMatches(p -> p.getNombre().equals("Mouse"))   // Verifica el segundo producto
                .expectNextMatches(p -> p.getNombre().equals("Teclado")) // Verifica el tercer producto
                .verifyComplete();                                       // Asegura que el flujo se complete
    }
}