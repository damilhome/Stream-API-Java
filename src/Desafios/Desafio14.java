package Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Com a Stream API, encontre o maior número primo da lista e
// exiba o resultado no console.
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer numero = numeros.stream()
                .filter(n -> ePrimo(n))
                .max(Comparator.naturalOrder()).orElse(null);

        System.out.println("Maior número primo: " + numero);
    }

    private static boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
