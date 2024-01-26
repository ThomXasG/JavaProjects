package ec.edu.charge.strategy.implement;

public class Principal {
    private String username;
    private String rol;

    public Principal(String username, String rol) {
        this.username = username;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "username='" + username + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
