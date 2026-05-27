public class MensajePush extends Mensajero{
    private String dispositivo;

    public MensajePush(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void mensaje(String mensaje){
        System.out.println("Enviar al dispositivo "+dispositivo+" - Mensaje: "+mensaje);
    }
}
