/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos

        // Trabajo clases 13 junio 2024
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";

        while (bandera) {
            System.out.println("Ingrese el nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese la id");
            String id = entrada.nextLine();
            System.out.println("Ingrese la edad");
            int edad = entrada.nextInt();
            System.out.println("Cual es el costo de cada credito");
            double costoCredito = entrada.nextDouble();
            System.out.println("Cual es la cantidad de creditos");
            int numCreditos = entrada.nextInt();

            EstudiantePresencial presencial = new EstudiantePresencial(nombre,
                    apellido, id, edad, costoCredito, numCreditos);
            presencial.calcularMatriculaPresencial();
            System.out.println("Desea salir, pulse S");
            entrada.nextLine();
            cadena = String.format("%s%s\n", cadena, presencial);
            String opcion = entrada.nextLine();
            if (opcion.toUpperCase().equals("S")) {
                bandera = false;
            }
        }

        System.out.printf("%s\n", cadena);

    }
}
