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
