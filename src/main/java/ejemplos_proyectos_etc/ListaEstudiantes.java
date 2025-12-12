package ejemplos_proyectos_etc;

import java.util.Scanner;

public class ListaEstudiantes {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cuantos estudiantes piensa guardar: ");
        var est = sc.nextInt();
        sc.nextLine();
        String[] estudiantes = new String[est];

        char condicion;

        for (int i = 0; i < est; i++) {
            System.out.print("Estudiante #"+(i+1)+": ");
            estudiantes[i]=sc.nextLine();
        }

        System.out.println();
        for (int i = 0; i < est; i++) {
            System.out.println("Estudiante #"+(i+1)+": "+estudiantes[i]); 
        }
        System.out.println();
        System.out.print("Ingresa el caracter inical de los estudiantes: ");
        condicion= sc.next().charAt(0);
        sc.nextLine();

        for (int i = 0; i < est; i++) {
            if (estudiantes[i].charAt(0)==condicion) {
                System.out.println(estudiantes[i]);
            }
        }
        


        System.out.println();

        System.out.print("Ingresa el caracter a buscar en todo el nombre: ");
        char ca = sc.next().charAt(0);
        String co= Character.toString(ca);
        sc.nextLine();
        
        boolean condition = false;
        for (int i = 0; i < est; i++) {
            //mediante contain busca si dentro del array hay algun string que contenga lo que se haya almacenado en co
            if (estudiantes[i].contains(co)) {
                System.out.println(estudiantes[i]);
                condition=true;
            }
        }
        if (!condition) {
            System.out.println("no se encontro un nombre que contenga ese caracter");
        }
        sc.close();
    }      
}
