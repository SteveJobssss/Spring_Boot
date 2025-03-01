package com.tuempresa.tuaapi.controllers;

// Importa las clases necesarias para trabajar con el modelo Producto y el servicio ProductoService
import com.tuempresa.tuaapi.models.Producto;
import com.tuempresa.tuaapi.services.ProductoService;

// Importa anotaciones y clases de Spring Framework para controladores REST
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Importa la clase List para manejar listas de productos
import java.util.List;

// Define esta clase como un controlador REST
@RestController
// Define la URI base para todas las solicitudes HTTP relacionadas con productos
@RequestMapping("/api/productos")
public class ProductoController {

    // Inyecta una instancia de ProductoService al controlador
    @Autowired
    private ProductoService productoService;

    // Endpoint para agregar un nuevo producto (HTTP POST)
    @PostMapping
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }

    // Endpoint para listar todos los productos (HTTP GET)
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

    // Endpoint para obtener un producto por su ID (HTTP GET)
    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(@PathVariable String id) {
        return productoService.obtenerProductoPorId(id);
    }

    // Endpoint para actualizar un producto por su ID (HTTP PUT)
    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable String id, @RequestBody Producto producto) {
        return productoService.actualizarProducto(id, producto);
    }

    // Endpoint para eliminar un producto por su ID (HTTP DELETE)
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable String id) {
        productoService.eliminarProducto(id);
    }
}