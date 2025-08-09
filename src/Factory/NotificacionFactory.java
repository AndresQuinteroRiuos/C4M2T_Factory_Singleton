package Factory;

public class NotificacionFactory {
    public static Notificacion getNotificacion(TipoNotificacion tipo) {
        switch (tipo) {
            case EMAIL:
                return new NotificacionEmail();
            case SMS:
                return new NotificacionSMS();
            case PUSH:
                return new NotificacionPush();
            default:
                throw new IllegalArgumentException("Tipo de notificación no válido");
        }
    }
}
