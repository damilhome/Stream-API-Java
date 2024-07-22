package Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Com a ajuda da Stream API, encontre o segundo número maior da lista e
// exiba o resultado no console.
public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Integer resultado = numeros.stream().max(Comparator.naturalOrder()).orElse(null);

        Integer resultado = numeros.stream()
                .sorted()
                .limit(numeros.size() - 1)
                .max(Comparator.naturalOrder()).orElse(null);

        System.out.println("Maior elemento: " + resultado);
    }
}
