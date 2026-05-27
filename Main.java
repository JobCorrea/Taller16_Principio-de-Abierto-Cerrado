public class Main{
    public static void main(String[] args) {
        
        Descuento porcentaje = new DescuentoPorcentaje(20);
        Descuento fijo = new DescuentoFijo(5000);

        porcentaje.mostrarDescuento(50000);
        fijo.mostrarDescuento(15000);
    }
}