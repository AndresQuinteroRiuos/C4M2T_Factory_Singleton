package Singleton;

public class Configuracion {
    private static Configuracion Instance;

    private final String username;
    private final String password;
    private String email;

    public static Configuracion getInstance(String username, String password, String email) {
        if (Instance == null) {
            Instance = new Configuracion(username, password, email);
        }
        return Instance;
    }

    private Configuracion(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Configuracion [username=" + username + ", password=" + password + ", email=" + email + "]";
    }
}