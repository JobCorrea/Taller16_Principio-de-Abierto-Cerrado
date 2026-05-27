public class Main{
    public static void main(String[] args) {
        
        Descuento porcentaje = new DescuentoPorcentaje(20);
        Descuento fijo = new DescuentoFijo(5000);

        porcentaje.mostrarDescuento(50000);
        fijo.mostrarDescuento(15000);
        System.out.println("________________________");

        Documento pdf = new DocumentoPDF("Habitos Hatomicos ");
        Documento word = new DocumentoWord("Las 48 leyes del poder");
        Documento excel = new DocumentoExcel("Psicologia oscura");

        pdf.exportar(); word.exportar(); excel.exportar();
    }
}