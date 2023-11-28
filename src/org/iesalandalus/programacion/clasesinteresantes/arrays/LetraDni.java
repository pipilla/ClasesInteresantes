package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

public class LetraDni {
    public static void main(String[] args) {
        int dni;
        do {
            System.out.print("Dime el número de tu DNI: ");
            dni = Entrada.entero();
        } while (dni < 19999999 || dni > 99999999);
        int resto = dni % 23;
        char[] dniArray = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Tu DNI completo es: " + dni + dniArray[resto]);
    }
}
