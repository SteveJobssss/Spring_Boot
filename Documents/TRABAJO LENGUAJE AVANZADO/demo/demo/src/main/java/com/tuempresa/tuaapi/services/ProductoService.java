package com.tuempresa.tuaapi.services;

// Importa la clase Producto para definir el tipo de datos en el servicio
import com.tuempresa.tuaapi.models.Producto;
import java.util.List;

// Define esta interfaz como un servicio
public interface ProductoService {

    // Método para agregar un nuevo producto
    Producto agregarProducto(Producto producto);

    // Método para listar todos los productos
    List<Producto> listarProductos();

    // Método para obtener un producto por su ID
    Producto obtenerProductoPorId(String id);

    // Método para actualizar un producto existente
    Producto actualizarProducto(String id, Producto producto);

    // Método para eliminar un producto por su ID
    boolean eliminarProducto(String id);
}