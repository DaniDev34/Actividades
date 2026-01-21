# Actividad 2
---

En esta actividad se aplican conocimientos aprendidos relacionados a Strings, Estructuras de Selección y Repetición, Arreglos en lenguaje **Java**, teniendo como base la **GuiaBasicosJava** proporcionada en plataforma. 

---

### Parte 1: Strings y Estructuras de Selección (`if / else`)

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
> Primer captura determina que el usuario es correcto
![Imagen ejercicio](captura_1_1.png)        

> Segunda captura determina que el usuario es incorrecto
![Imagen2 ejercicio](captura_1_2.png)

### Parte 2: Estructura de repeticiones y arreglos (`for`) 

- Desarrolla un programa que genere una lista de números enteros pares desde dos hasta 100; para lograrlo, puedes utilizar una estructura de repetición (for o while).
- Almacena estos números en un arreglo.
- Luego, utiliza una estructura de repetición para recorrer el arreglo y mostrar en pantalla los números almacenados.

> Base del código por mejorar

```java
public class Actividad2 {
    public static void main(String[] args) {
//crear arreglo para pares
        int[] arregloPares = new int[50];
//indice del arreglo
        int arregloIndice = 0;
//completar el arreglo con pares
        for (int numero = 2; numero <= 100; numero += 2) {
            arregloPares[arregloIndice] = numero;
            arregloIndice++;
        }
//imprimir el arreglo en terminal
        System.out.println("Números pares del 2 al 100:");
//usar una sola linea
        for (int i = 0; i < arregloPares.length; i++) {
            System.out.print(arregloPares[i]);
//agregar coma por estetica
            if (i < arregloPares.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
```

