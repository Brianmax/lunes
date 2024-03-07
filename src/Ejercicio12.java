import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena");
        String cadena = sc.nextLine();
        char letra = 'a';
        int contador = 0;
        char letra2 = 'b';

        for (int i = 0; i < cadena.length(); i++) {
            if(letra2==cadena.charAt(i))
            {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
