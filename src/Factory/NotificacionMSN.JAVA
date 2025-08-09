   package Factory;

public class NotificacionMSN implements Notificacion {
    
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación MSN: " + mensaje);
    }
}