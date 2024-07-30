package controller;

import model.ProductoModel;

/**
 *
 * @author Jose Torres
 */
public class ProductoController {

    private static ProductoModel producto_model;

    public void registrarproducto(String nombre_producto, String tipo_producto, 
            int precio_producto, int cantidad_producto, String descripcion_producto) {

        producto_model = new ProductoModel(nombre_producto, tipo_producto, precio_producto, cantidad_producto, descripcion_producto);
    }

    public ProductoModel mostrarProducto() {
        return producto_model;
    }
}
