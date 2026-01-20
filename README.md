# Actividad 2
---

En esta actividad se aplican conocimientos aprendidos relacionados a Strings, Estructuras de Selección y Repetición, Arreglos en lenguaje **Java**, teniendo como base la **GuiaBasicosJava** proporcionada en plataforma. 

---

### Parte 1: Strings y Estructuras de Selección

- Crea un programa Java que solicite al usuario ingresar su nombre.
- Utiliza estructuras de selección (if o switch) para verificar si el nombre ingresado coincide con uno específico que definas en tu programa; dependiendo de la coincidencia, muestra un mensaje personalizado.
-   Aprovecha las operaciones de manejo de cadenas de texto para, así, realizar comparaciones con sensibilidad a mayúsculas o minúsculas y, de esta manera, proporcionar mensajes adecuados.

#### Código usado en Java

```java
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
```