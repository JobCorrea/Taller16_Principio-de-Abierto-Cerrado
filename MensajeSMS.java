public class MensajeSMS extends Mensajero{
    private int numeroTel;

    public MensajeSMS(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    @Override
    public void mensaje(String mensaje){
        System.out.println("Enviar mensaje al numero "+numeroTel+" - Mensaje: "+mensaje);
    }
}
