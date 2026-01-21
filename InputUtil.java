import java.util.Scanner;
public class InputUtil {
    private static final Scanner sc = new Scanner(System.in);

    public static String leerString(String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine().trim();
    }

    public static int leerInt(String mensaje) {
        int valor;
        while (true) {
            System.out.println(mensaje);
            try {
                valor = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Introduzca un numero correcto por favor:");
            }
        }
        return valor;
    }

    public static int leerInt(String mensaje, int min, int max) {
        int valor;
        while (true) {
            valor = leerInt(mensaje);
            if (valor >= min && valor <= max) break;
            System.out.println("Por favor, introduzca una opcion correcta.");
        }
        return valor;
    }

    public static boolean comprobarEmail(String email) {
        return email.contains("@");
    }

    public static String leerEmail(String mensaje) {
        String email;
        while (true) {
            System.out.println(mensaje);
            email = sc.nextLine();
            if (comprobarEmail(email)) {
                break;
            } else {
                System.out.println("El email no es valido. ");
            }
        }
        return email;
    }
}


