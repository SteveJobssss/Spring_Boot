package com.tuempresa.tuaapi.services;

// Importa la clase Producto y librerías necesarias
import com.tuempresa.tuaapi.models.Producto;
import org.springframework.stereotype.Service;

// Importa utilidades para generar IDs y filtrar listas
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Define esta clase como un componente de servicio
@Service
public class ProductoServiceImpl implements ProductoService {

    // Almacena los productos en una lista (simula una base de datos en memoria)
    private List<Producto> productos = new ArrayList<>();

    // Implementación del método para agregar un producto
    @Override
    public Producto agregarProducto(Producto producto) {
        // Genera un nuevo ID único usando UUID
        producto.setId(UUID.randomUUID().toString());
        // Agrega el producto a la lista
        productos.add(producto);
        return producto;
    }

    // Implementación del método para listar productos
    @Override
    public List<Producto> listarProductos() {
        return productos;
    }

    // Implementación del método para obtener un producto por ID
    @Override
    public Producto obtenerProductoPorId(String id) {
        // Busca en la lista el producto con el ID especificado
        return productos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Implementación del método para actualizar un producto
    @Override
    public Producto actualizarProducto(String id, Producto producto) {
        // Busca el producto existente en la lista
        Producto existing = obtenerProductoPorId(id);
        if (existing != null) {
            // Actualiza los campos del producto existente
            existing.setNombre(producto.getNombre());
            existing.setPrecio(producto.getPrecio());
            return existing;
        }
        return null;
    }

    // Implementación del método para eliminar un producto
    @Override
    public boolean eliminarProducto(String id) {
        // Elimina el producto con el ID especificado de la lista
        return productos.removeIf(p -> p.getId().equals(id));
    }
}