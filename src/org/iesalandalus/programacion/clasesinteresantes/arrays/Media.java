package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Media {
    public static void main(String[] args) {
        int nNum;
        do {
            System.out.print("Dime la cantidad de números a generar: ");
            nNum = Entrada.entero();
        } while (nNum < 3);
        int[] miArray = new int[nNum];
        int media = 0;
        int nEncimaMedia = 0;
        int nDebajoMedia = 0;
        int nIgualesMedia = 0;
        String posicionesIgualesMedia = "";
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = (int) (Math.random() * 101);
            media += miArray[i];
        }
        media = media / miArray.length;
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] > media) {
                nEncimaMedia++;
            } else if (miArray[i] < media) {
                nDebajoMedia++;
            } else if (miArray[i] == media) {
                nIgualesMedia++;
                posicionesIgualesMedia = posicionesIgualesMedia + String.valueOf(i) + ", ";
            }
        }
        System.out.println("La media es: " + media + ", hay " + nEncimaMedia + " número/s por encima de la media, " + nDebajoMedia + " número/s por debajo de la media y " + nIgualesMedia + " número/s iguales que la media, cuyas posiciones son: " + posicionesIgualesMedia);
    }
}
