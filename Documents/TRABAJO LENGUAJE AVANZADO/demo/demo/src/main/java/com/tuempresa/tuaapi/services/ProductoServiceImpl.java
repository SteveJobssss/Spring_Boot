package com.tuempresa.tuaapi.services;

import com.tuempresa.tuaapi.models.Producto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductoServiceImpl implements ProductoService {
    private List<Producto> productos = new ArrayList<>();

    @Override
    public Producto agregarProducto(Producto producto) {
        producto.setId(UUID.randomUUID().toString());
        productos.add(producto);
        return producto;
    }

    @Override
    public List<Producto> listarProductos() {
        return productos;
    }

    @Override
    public Producto obtenerProductoPorId(String id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Producto actualizarProducto(String id, Producto producto) {
        Producto existing = obtenerProductoPorId(id);
        if (existing != null) {
            existing.setNombre(producto.getNombre());
            existing.setPrecio(producto.getPrecio());
            return existing;
        }
        return null;
    }

    @Override
    public boolean eliminarProducto(String id) {
        return productos.removeIf(p -> p.getId().equals(id));
    }
}
