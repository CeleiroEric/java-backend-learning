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

    public void filtrarUsuarios(){
        System.out.println("Opciones:");
        System.out.println("1.Filtrar por letra");
        System.out.println("2.Filtrar por dominio de email");
        int opcion = InputUtil.leerInt("Introduzca una opcion",1,2);

        if(opcion==1){
            String letra = InputUtil.leerString("Introduzca la letra por la que comienza el usuario");
            List<Usuario> usuariosFiltrados = usuarios.stream().filter(usuario -> usuario.getNombre().toUpperCase().startsWith(letra.toUpperCase())).toList();
            usuariosFiltrados.forEach(System.out::println);
        }
        if(opcion==2){
            String dominio = InputUtil.leerString("Introduzca un dominio (Ejemplo: '@gmail')");
            List<Usuario> emailsFiltrados = usuarios.stream().filter(usuario -> usuario.getEmail().contains(dominio)).toList();
            emailsFiltrados.forEach(System.out::println);
        }
    }
}
