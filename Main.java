
public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        cargarDatosIniciales(sistema);
        int opcion = 0;
        System.out.println("¡Bienvenido!");
        while(opcion!=3){
            System.out.println("1.Crear usuario.");
            System.out.println("2.Listar usuarios");
            System.out.println("3.Salir del programa");
            opcion = InputUtil.leerInt("Elija una opcion: ",1,3);


            switch(opcion){
                case 1:
                    String nombre = InputUtil.leerString("Introduzca el nombre del usuario: ");
                    String email = InputUtil.leerEmail("Introduzca el email del usuario: ");
                    Usuario usuario = new Usuario(nombre, email);
                    sistema.agregarUsuario(usuario);
                    System.out.println("¡El usuario ha sido creado correctamente!");
                    break;

                case 2:
                    sistema.listarUsuarios();
                    break;
            }
        }
        }
        public static void cargarDatosIniciales(Sistema sistema){
            Usuario usuario1 = new Usuario("Eric","celeiroericwork@gmail.com");
            sistema.agregarUsuario(usuario1);
        }
    }
