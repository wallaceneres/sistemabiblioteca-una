package utils;

import java.util.List;

import models.Livro;

public class bubbleSort{
    public static void bubbleSortMethod(List<Livro> livros) {
        int n = livros.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (livros.get(j).getTitulo().compareToIgnoreCase(livros.get(j + 1).getTitulo()) > 0) {
                    // Trocar os livros de posição
                    Livro temp = livros.get(j);
                    livros.set(j, livros.get(j + 1));
                    livros.set(j + 1, temp);
                }
            }
        }
    }
}
