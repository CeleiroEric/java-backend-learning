public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email){
        this.nombre=nombre;
        this.email=email;
    }
    public String toString(){return "Usuario con nombre " + nombre + " y email " + email + "."; }
}
