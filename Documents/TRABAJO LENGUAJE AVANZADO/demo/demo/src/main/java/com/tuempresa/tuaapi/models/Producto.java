package com.tuempresa.tuaapi.models;

// Importa anotaciones Lombok para reducir el boilerplate
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Genera getters, setters, toString, equals, hashCode y constructores
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private String id;      // Identificador único del producto
    private String nombre;  // Nombre descriptivo del producto
    private double precio;  // Valor monetario del producto
}