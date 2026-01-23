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

    public boolean emailRepetido(String email){
        for(Usuario usuario:usuarios){
            if(usuario.getEmail().equalsIgnoreCase(email)){
                return true;
            }
        }
        return false;
    }




    public void listarUsuarios(){
        int contador=1;
        for(Usuario usuario : usuarios){
            System.out.println(contador +"." + usuario);
            contador++;
        }
    }
}
