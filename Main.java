import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //pedir numero (inputNumber)
        System.out.println("Ingrese un numero:");
        int inputNumber = scanner.nextInt();
        
        //cuatos numeros pares hay entre 1 e inputNumber
        int pairCount = inputNumber / 2;

        //generar array de pares
        int[] pairNumArray = new int[pairCount];
        
        //contador para el array
        int arrayIndex = 0;
        
        //recuperar todos los numeros entre 1 e inputNumber
        for (int i = 2; i <= inputNumber; i++) {
            //comparar si es par 

            if (i % 2 == 0) {
                //entra si verdadero}
                pairNumArray[arrayIndex] = i;
                arrayIndex++;
            }
        }

        //imprimir array en una sola linea
        System.out.print("Numeros pares entre 1 y " + inputNumber + ": ");
        for (int j = 0; j < pairNumArray.length; j++) {
            System.out.print(pairNumArray[j]);
            if (j < pairNumArray.length - 1) {
                System.out.print(", ");
            }
        }
        //comparadores (>, <, >=, <=, ==, !=)

        scanner.close();
    }  
}
