import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu calificación: ");
        int calificacion = scanner.nextInt();
        String resultado = "";

        if (calificacion <= 100 && calificacion >= 0)  // se usan "&&" para indicar "and"
            if (calificacion >= 90)
                resultado = "Excelente";
             else if (calificacion >= 80) 
                resultado = "Muy Bien";
             else if (calificacion >=70) 
                resultado = "Aprobado";
             else 
                resultado = "Reprobado";
        else    
            resultado = "Calificación inválida";
            System.err.println(resultado);
            // si la calificación sobrepasa 100 o es negativa, se usa "||" para indicar "or"
        scanner.close();
        }

    }  