package com.tuempresa.tuaapi.tests;

import com.tuempresa.tuaapi.controllers.ProductoReactivoController;
import com.tuempresa.tuaapi.models.Producto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
public class ProductoControllerTest {
    @Autowired
    private ProductoReactivoController productoReactivoController;

    @Test
    public void testListarProductos() {
        Flux<Producto> productos = productoReactivoController.listarProductos();
        StepVerifier.create(productos)
                .expectNextMatches(p -> p.getNombre().equals("Laptop"))
                .expectNextMatches(p -> p.getNombre().equals("Mouse"))
                .expectNextMatches(p -> p.getNombre().equals("Teclado"))
                .verifyComplete();
    }
}