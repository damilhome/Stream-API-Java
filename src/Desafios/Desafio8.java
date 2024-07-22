package Desafios;

import java.util.Arrays;
import java.util.List;

// Utilizando a Stream API, realize a soma dos dígitos de todos os
// números da lista e exiba o resultado no console.
public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
                .flatMap(numero -> Arrays.stream(String.valueOf(numero).split("")))
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("A soma dos dígitos é: " + somaDosDigitos);
    }
}
