package Factory;

public class NotificacionPush implements Notificacion {
       @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación push: " + mensaje);
    }

}
