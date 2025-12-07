package ejemplos_proyectos_etc;

import java.util.Scanner;

public class SistemaNotasSencillo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        var usuario = sc.nextLine();
        double nota1=0, nota2=0, nota3=0;
        char opcionContinuar='s';

        System.out.println("Bienvenido al calculador de promedio "+usuario);
        do {
                do {
                    System.out.print("Ingrese la nota 1: ");
                    nota1= sc.nextDouble();
                    if(nota1<0 || nota1>5.0){
                        System.out.println("El valor debe ser entre 0 y 5");
                    }
                } while (nota1<0 || nota1>5.0);
                do {
                    System.out.print("Ingrese la nota 2: ");
                    nota2= sc.nextDouble();
                    if(nota2<0 || nota2>5.0){
                        System.out.println("El valor debe ser entre 0 y 5");
                    }
                } while (nota2<0 || nota2>5.0);

                do {
                    System.out.print("Ingrese la nota 3: ");
                    nota3= sc.nextDouble();
                    if(nota3<0 || nota3>5.0){
                        System.out.println("El valor debe ser entre 0 y 5");
                    }
                } while (nota3<0 || nota3>5.0);


                double promedio = (nota1+nota2+nota3)/3.0;
                System.out.println("Su promedio fue de: "+promedio);
                if(promedio>2.9){
                    System.out.println("El estudiante aprobo");
                }else{
                    System.out.println("El estudiante no aprobo");
                }

                System.out.print("Desea continuar S/N: ");
                opcionContinuar= sc.next().charAt(0);
        } while(opcionContinuar !='N' && opcionContinuar!='n');
            
        sc.close();
        
    }
}
