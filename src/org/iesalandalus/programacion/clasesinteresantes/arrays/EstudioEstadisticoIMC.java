package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

public class EstudioEstadisticoIMC {
    public static void main(String[] args) {
        String nombre;
        int peso;
        int altura;
        int contadorImc = 1;
        char respuesta = 'n';
        do {
            System.out.print("Dime el nombre del sujeto nª" + contadorImc + ": ");
            nombre = Entrada.cadena();
            do {
                System.out.print("Dime el peso en kg del primer sujeto: ");
                peso = Entrada.entero();
            } while (peso <= 0);
            do {
                System.out.print("Dime la altura en cm del sujeto: ");
                altura = Entrada.entero();
            } while (altura <= 0);
            double alturaMetros = (double) altura / 100;
            double imc = peso / (alturaMetros * alturaMetros);
            System.out.println(imc);
            contadorImc++;
            if (contadorImc > 2) {
                do {
                    System.out.print("¿Quiéres seguir añadiendo sujetos? s/n:");
                    respuesta = Entrada.caracter();
                } while (respuesta == 's' || respuesta == 'n');
            }
            double[] conjuntoImc = new double[contadorImc];
            conjuntoImc[contadorImc] = imc;
        } while (respuesta == 'n');

    }
}
