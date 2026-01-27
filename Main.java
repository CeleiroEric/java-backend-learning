public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        cargarDatosIniciales(sistema);
        int opcion = 0;
        System.out.println("¡Bienvenido!");
        while(opcion!=4){
            System.out.println("1.Crear usuario.");
            System.out.println("2.Listar usuarios");
            System.out.println("3.Filtrar usuarios");
            System.out.println("4.Salir del programa");
            opcion = InputUtil.leerInt("Elija una opcion: ",1,4);

            switch(opcion){
                case 1:
                    String nombre = InputUtil.leerString("Introduzca el nombre del usuario: ");
                    String email = InputUtil.leerEmailUnico("Introduzca el email del usuario: ",sistema);
                    Usuario usuario = new Usuario(nombre, email);
                    sistema.agregarUsuario(usuario);
                    System.out.println("¡El usuario ha sido creado correctamente!");
                    break;

                case 2:
                    sistema.listarUsuarios();
                    break;

                case 3:
                    sistema.filtrarUsuarios();
                    break;
            }
        }
    }
    public static void cargarDatosIniciales(Sistema sistema){
        Usuario usuario1 = new Usuario("Eric","celeiroericwork@gmail.com");
        Usuario usuario2 = new Usuario("Eugenia","eugenia@gmail.com");
        Usuario usuario3 = new Usuario("Roberto","roberto@hotmail.com");
        sistema.agregarUsuario(usuario1);
        sistema.agregarUsuario(usuario2);
        sistema.agregarUsuario(usuario3);
    }
}
