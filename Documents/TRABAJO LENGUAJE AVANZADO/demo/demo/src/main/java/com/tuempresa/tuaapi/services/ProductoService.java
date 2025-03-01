package com.tuempresa.tuaapi.services;

import com.tuempresa.tuaapi.models.Producto;
import java.util.List;

public interface ProductoService {
    Producto agregarProducto(Producto producto);
    List<Producto> listarProductos();
    Producto obtenerProductoPorId(String id);
    Producto actualizarProducto(String id, Producto producto);
    boolean eliminarProducto(String id);
}