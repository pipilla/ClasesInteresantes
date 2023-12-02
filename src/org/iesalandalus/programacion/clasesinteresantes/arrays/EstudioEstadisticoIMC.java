package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

public class EstudioEstadisticoIMC {
    public static void main(String[] args) {
        String nombre;
        int peso;
        int altura;
        int contadorImc = 0;
        char respuesta = 's';
        double media = 0;
        double mayorImc = 0;
        int posicionMayorImc = 0;
        double menorImc = 0;
        int posicionMenorImc = 0;
        int sujetosEncimaMedia = 0;
        int sujetosDebajoMedia = 0;
        String[] conjuntoNombres = new String[100];
        double[] conjuntoImc = new double[100];
        do {
            System.out.print("Dime el nombre del sujeto nª" + contadorImc + ": ");
            nombre = Entrada.cadena();
            do {
                System.out.print("Dime el peso en kg del sujeto: ");
                peso = Entrada.entero();
            } while (peso <= 0);
            do {
                System.out.print("Dime la altura en cm del sujeto: ");
                altura = Entrada.entero();
            } while (altura <= 0);
            double alturaMetros = (double) altura / 100;
            double imc = peso / (alturaMetros * alturaMetros);
            System.out.println(imc);
            if (contadorImc == 0) {
                mayorImc = imc;
                menorImc = imc;
            }
            if (imc > mayorImc) {
                mayorImc = imc;
                posicionMayorImc = contadorImc;
            }
            if (imc < menorImc) {
                menorImc = imc;
                posicionMenorImc = contadorImc;
            }
            conjuntoNombres[contadorImc] = nombre;
            conjuntoImc[contadorImc] = imc;
            media += imc;
            contadorImc++;
            if (contadorImc > 1) {
                do {
                    System.out.print("¿Quiéres seguir añadiendo sujetos? s/n:");
                    respuesta = Entrada.caracter();
                } while (respuesta != 's' && respuesta != 'n');
            }
        } while (respuesta == 's');
        media /= contadorImc;
        for (int i = 0; i < contadorImc; i++) {
            if (conjuntoImc[i] > media) {
                sujetosEncimaMedia++;
            } else if (conjuntoImc[i] < media){
                sujetosDebajoMedia++;
            }
        }
        System.out.println("La media del IMC de dichos sujetos es de: " + media);
        System.out.println("El sujeto con mayor IMC es: " + conjuntoNombres[posicionMayorImc] + ". Con el IMC: " + conjuntoImc[posicionMayorImc]);
        System.out.println("El sujeto con menor IMC es: " + conjuntoNombres[posicionMenorImc] + ". Con el IMC: " + conjuntoImc[posicionMenorImc]);
        System.out.println("Hay " + sujetosEncimaMedia + " sujetos con un IMC por encima de la media");
        System.out.println("Hay " + sujetosDebajoMedia + " sujetos con un IMC por debajo de la media");
    }
}
