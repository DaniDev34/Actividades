import java.util.Scanner;
public class Actividad2 {
    public static void main(String[] args) {
        String nombre1 = "Daniel";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre2 = scanner.nextLine();
        if (nombre1.equals(nombre2)) {
            System.out.println("Hola Daniel, bienvenido");
        } else {
            System.out.println("Accesso denegado");
        }   
        scanner.close();
    }
}
