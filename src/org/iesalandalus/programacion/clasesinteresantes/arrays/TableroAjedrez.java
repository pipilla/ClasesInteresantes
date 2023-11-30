package org.iesalandalus.programacion.clasesinteresantes.arrays;

public class TableroAjedrez {
    public static void main(String[] args) {
        char[][] tablero = new char[8][8];
        char casillaBlanca = ' ';
        char casillaNegra = 'X';
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = casillaBlanca;
                } else {
                    tablero[i][j] = casillaNegra;
                }
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
