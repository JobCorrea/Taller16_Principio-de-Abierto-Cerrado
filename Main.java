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
        System.out.println("________________________");

        Mensajero email = new MensajeroEmail("Pipa23@gmail.com");
        Mensajero sms = new MensajeSMS(231452478);
        Mensajero push = new MensajePush("XIAOMI MIO");

        email.mensaje("Bienvenido a la UDC");
        sms.mensaje("Usted a recibido una llamada el '26-05-2026'");
        push.mensaje("Tienes una nueva notificacion ");

    }
}