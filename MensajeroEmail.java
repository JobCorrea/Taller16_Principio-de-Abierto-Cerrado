public class MensajeroEmail extends Mensajero{
    private String email;

    public MensajeroEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void mensaje(String mensaje){
        System.out.println("Enviar Email a "+email +" - Mensaje: "+mensaje);
    }
}
