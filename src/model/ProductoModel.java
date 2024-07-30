package model;

/**
 *
 * @author Jose Torres
 */
public class ProductoModel {

    private String nombre_producto;
    private String tipo_producto;
    private int precio_producto;
    private int cantidad_producto;
    private String descripcion_producto;

    public ProductoModel() {
    }

    public ProductoModel(String nombre_producto, String tipo_producto, int precio_producto, int cantidad_producto, String descripcion_producto) {
        this.nombre_producto = nombre_producto;
        this.tipo_producto = tipo_producto;
        this.precio_producto = precio_producto;
        this.cantidad_producto = cantidad_producto;
        this.descripcion_producto = descripcion_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public int getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(int precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    @Override
    public String toString() {
        return "nombre_producto: " + nombre_producto + "\ntipo_producto: " + tipo_producto
                + "\nprecio_producto: " + precio_producto + "\ncantidad_producto: " + cantidad_producto
                + "\ndescripcion_producto: " + descripcion_producto;
    }

}
