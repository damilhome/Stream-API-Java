package Desafios;

import java.util.Arrays;
import java.util.List;

// Com a ajuda da Stream API, filtre os números primos da lista e
// exiba o resultado no console.
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(n -> ePrimo(n))
                .forEach(System.out::println);
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
