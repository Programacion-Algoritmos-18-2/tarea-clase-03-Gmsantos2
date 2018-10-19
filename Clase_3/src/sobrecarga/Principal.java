/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // objeto scanner
        Trabajador t = new Trabajador(); // creo el objeto t para la clase trabajador 
        double[] sueldo = new double [4];  //inicializo arreglo
        System.out.println("Número de nombres del trabajador 1 o 2"); //pido un valor entero para entrar posteriormente
        int numero_nombres = scanner.nextInt(); // inicializacion
        scanner.nextLine();// limiamos el scanner
        
        if(numero_nombres==1){ // condicional ue nos da 2 formas de agregar los nombres
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        }else{
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);
        
        }
        
        System.out.println("Ingrese el apellido del trabajador"); // ingreso de string (apellido)
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
         System.out.println("Ingrese el sueldo del trabajador (opcion 1,2):"); // pido valosr int para despues  inresar  el sueldo  mensual por 2 formas
            int opt = scanner.nextInt();
        if(opt == 1){    
        for (int i = 0 ;i <= 3;i++ ){ // se presenta con la suma del arreglo en la clase
            System.out.printf("Ingrese el sueldo del trabajador %d\n",i+1);
             t.sumar_sueldo(sueldo);
        }
        
        
          }else{ // se presenta con las cuatro variables sumadas
            System.out.printf("Ingrese el sueldo del trabajador 1\n");
            double s1 = scanner.nextDouble();
            System.out.printf("Ingrese el sueldo del trabajador 2\n");
            double s2 = scanner.nextDouble();
            System.out.printf("Ingrese el sueldo del trabajador 3\n");
            double s3 = scanner.nextDouble();
            System.out.printf("Ingrese el sueldo del trabajador 4\n");
            double s4 = scanner.nextDouble();
            t.agregar_sueldo_semanal(s1,s2,s3,s4);
        }
            System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());    // salida
        }
         
        }
        
                
    

