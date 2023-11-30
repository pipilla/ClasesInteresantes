package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MayorYMenor {
    public static void main(String[] args) {
        int nNum;
        do {
            System.out.print("Dime la cantidad de números a generar: ");
            nNum = Entrada.entero();
        } while (nNum < 2);
        int[] miArray = new int[nNum];
        int menor = 1000;
        int posicionMenor = 0;
        int posicionMayor = 0;
        int mayor = 0;
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = (int) (Math.random() * 1001);
            if (miArray[i] < menor) {
                menor = miArray[i];
                posicionMenor = i;
            }
            if (miArray[i] > mayor) {
                mayor = miArray[i];
                posicionMayor = i;
            }
        }
        System.out.println("El número menor es: " + menor + " y está en la posición: " + posicionMenor);
        System.out.println("El número mayor es: " + mayor + " y está en la posición: " + posicionMayor);

    }
}
