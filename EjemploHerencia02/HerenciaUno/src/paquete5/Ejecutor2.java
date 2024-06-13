/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.*;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial,
        // con datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        ArrayList<EstudiantePresencial> estudiantes = new ArrayList<>();
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextDouble();
            entrada.nextLine();

            EstudiantePresencial presencial = new EstudiantePresencial(n, ap, ced,
                    edad, creditos, costo);
            estudiantes.add(presencial);
            System.out.println("Ingrese n para salir del ciclo");
            String aux = entrada.nextLine();
            if (aux.equals("n")) {
                bandera = false;
            }
        }

        for (int i = 0; i < estudiantes.size(); i++) {
            estudiantes.get(i).calcularMatriculaPresencial();
            System.out.printf("Estudiante %d:\n%s\n", (i + 1), estudiantes.get(i));
        }

    }
}
