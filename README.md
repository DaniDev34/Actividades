# Actividad 2

## Introducción 
Este repositorio contiene ejercicios básicos de diferentes dificultades hechos en **Java** para reforzar los conocimientos y fundamentos del lenguaje. 

---

## Ejercicios Básicos 

### Ejercicio 1: Saludo simple 

```java
public class Main {
        public static void main(String[] args) {
            String nombre = "Daniel";
            System.out.println("Hola " + nombre);
        }
    }
```

![Imagen del ejercicio](captura_ejercicio_1.png)

### Ejercicio 2: Suma de dos enteros

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresa un número:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresa otro número:");
        int numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        System.out.println("Resultado de la suma: " + suma);

        scanner.close();
    }
}
```
![Imagen del ejercicio 2](captura_2.png)

### Ejercicio 3: Conversión de decimal a entero 

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        int numeroEntero = (int) numeroDecimal;
        System.out.println("Resultado: " + numeroEntero);
        scanner.close();
    }
}
```
![Imagen del ejercicio 2](captura_3.png)

### Ejercicio 4: Calculadora básica con operadores

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("Resultado de la suma: " + suma);
        System.out.println("Resultado de la resta: " + resta);
        System.out.println("Resultado de la multiplicación: " + multiplicacion);
        System.out.println("Resultado de la división: " + division);
        System.out.println("Resultado del módulo: " + modulo);
        scanner.close();
    }
}
```

![Imagen del ejercicio 2](captura_4.png)

### Ejercicio 5: if-else (ejemplo con mayoria de edad)

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad para registrarte:");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, te has registrado exitosamente.");
        } else {
            System.out.println("Eres menor de edad, falló al registrarte.");
        }
        scanner.close();
    }  
}
```
>Primer captura determina que la persona es mayor de edad
![Imagen del ejercicio 2](captura_5_1.png)

>Segunda captura determina que la persona es menor de edad
![Imagen del ejercicio 2](captura_5_1.png)


