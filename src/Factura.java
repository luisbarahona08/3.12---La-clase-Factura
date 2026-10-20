public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor con validaciones
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;

        // Validacion de cantidad positiva
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }

        // Validacion de precio positivo
        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    // Metodo para calcular el monto total de la factura
    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}