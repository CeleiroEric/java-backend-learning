import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Usuario> usuarios;

    public Sistema(){
        this.usuarios=new ArrayList<>();
    }
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public void listarUsuarios(){
        for(Usuario usuario : usuarios){
            System.out.println(usuario);
        }
    }
}
