import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TutorialArrays {
    public static void main(String[] args) {
        int[] valores = new int[5];
        int[] valores2 = {3,2,55,12,9};

        valores[2] = 1000;
        valores[0] = 203;
        // imprimir un valor
        System.out.println(valores[3]);
        System.out.println(valores[2]);

        System.out.println(valores2[4]);

        int tamanio = valores.length;
        System.out.println(tamanio);

        // declarar lista

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Jose");
        nombres.add("Juan");
        nombres.add("Rene");

        nombres.remove("Jose");

        // combinacion de for con arrays
        System.out.println("Imprimiendo el array");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(valores2[i]);
        }
    }
}
