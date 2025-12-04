package ejemplos_proyectos_etc;

import java.util.Scanner;

public class VerificarEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("BIENVENIDO");
        System.out.print("Por favor ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("señor "+nombre+" ingrese su edad: ");
        edad = sc.nextInt();

        if (12>edad) {
            System.out.println("señor "+nombre+", usted es un niño");
        }else if (edad>=60) {
            System.out.println("señor "+nombre+", usted es un adulto mayor");
            
        }else if(edad<17){
            System.out.println("señor "+nombre+", usted es un adolescente");

        }else{
            System.out.println("señor "+nombre+", usted es un adulto");
        }
    sc.close();

    }
}
