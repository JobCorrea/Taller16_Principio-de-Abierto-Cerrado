public abstract class Descuento{
    public abstract double calcularDescuento(double precio);
    
    public void mostrarDescuento(double precio) {
        System.out.println("Precio original: " + precio
        + " - Descuento: " + calcularDescuento(precio)
        + " - Precio final: " + (precio - calcularDescuento(precio)));
    }
}