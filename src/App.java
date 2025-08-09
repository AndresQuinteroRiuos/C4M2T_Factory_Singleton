public class App {
    
    public static void main(String[] args) {

        // Singleton
        Configuracion config = Configuracion.getInstance("Pedro", "12345", "elpedro@gmail.com");

        System.out.println(config.toString());
        config.setEmail("pedrolaporta@gmail.com");
        System.out.println(config.toString());

        Configuracion config2 = Configuracion.getInstance(null, null, null);
        System.out.println(config2.toString());

        // Configuracion config = new Configuracion("Pedro", "123456",
        // "pedro@gmail.com");

        // Configuracion config2 = new Configuracion("Pedro", "123456",
        // "pedro@gmail.com");

        // Factory
        Notificacion email = NotificacionFactory.getNotificacion(TipoNotificacion.EMAIL);
        email.enviar("firmar para mañana");

        Notificacion sms = NotificacionFactory.getNotificacion(TipoNotificacion.SMS);
        sms.enviar("retiro en cajero x");

        Notificacion push = NotificacionFactory.getNotificacion(TipoNotificacion.PUSH);
        push.enviar("descuentos de black friday");

    }
}
