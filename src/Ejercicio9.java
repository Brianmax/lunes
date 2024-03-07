public class Ejercicio9 {
    public static void main(String[] args) {
        int[] numeros = {3,2,55,12,9,93,23,26,92,82};
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            suma = suma + numeros[i];
        }
        System.out.println(suma);
    }
}
