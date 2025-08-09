

Package C4M2T_Factory_Singleton.Singleton;
public class Configuracion {
    private static Configuracion Instance;

    Private String Username;
    Private String Password;
    Private String Email;

    public static Configuracion getInstance(String Username, String Password, String Email) {
        if (Instance == null) {
            Instance = new Configuracion(Username, Password, Email);
        }
        return Instance;
    }

    Private Configuracion(String Username, String Password, String Email) {
    this.Username = Username;
    this.Password = Password;
    this.Email = Email;



}

Public String getUsername() {
    return Username;
}
Public String getPassword() {
    return Password;
}
Public String getEmail() {
    return Email;
}

Public Void SetEmail(String Email) {
    this.Email = Email;
}

@Override
public String toString() {

    return "Configuracion [Username=" + Username + ", Password=" + Password + ", Email=" + Email+ "]";
      
}

}