import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();

        int opcion = 0;
        System.out.println("¡Bienvenido!");
        while(opcion!=3){
            System.out.println("Elija una opcion:");
            System.out.println("1.Crear usuario.");
            System.out.println("2.Listar usuarios");
            System.out.println("3.Salir del programa");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("Introduzca el nombre del usuario:");
                    String nombre = sc.nextLine();
                    System.out.println("Introduzca el email del usuario:");
                    String email = sc.nextLine();
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
    }
