package ejemplos_proyectos_etc;

import java.util.Scanner;

public class GestionNotasArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadEstudiantes;
        int opcion=0;
        System.out.println("Bienvenido al Sistema de gestion de estudiantes");
        System.out.print("Cuantos estudiante desea calificar: ");
        cantidadEstudiantes= sc.nextInt();
        String[] Estudiantes = new String[cantidadEstudiantes];
        double[] notas = new double[cantidadEstudiantes];

        char opcionContinuar ='S';
        do {
            System.out.println("1. Ingresar notas\r\n" + //
                                "2. Mostrar todas las notas\r\n" + //
                                "3. Mostrar el promedio del curso\r\n" + //
                                "4. Mostrar la nota más alta y la más baja\r\n" + //
                                "5. Buscar nota de un estudiante por índice\r\n" + //
                                "0. Salir");
            System.out.print("Que desea escoger: ");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < notas.length; i++) {
                        boolean condicion=false;
                        double nota=0;
                        String estudiante;
                        do {
                            System.out.print("Ingrese el nombre del estudiante: ");
                            estudiante=sc.nextLine();
                            if (estudiante.isEmpty()) {
                                System.out.println("Error, el nombre no puede estar en blanco");
                            }
                            else{
                                Estudiantes[i]=estudiante;
                                condicion=true;
                            }
                        } while (!condicion);
                        
                        do {    
                            System.out.print("Ingrese la nota del estudiante: ");
                            nota=sc.nextDouble();
                            if (nota<0 || nota>5) {
                                System.out.println("Error la nota deber ser entre 0 y 5");
                            }
                            else{
                                notas[i]=nota;
                            }

                        } while (nota<0 || nota>5);
                        sc.nextLine();
                    }
                    
                    break;
                case 2:
                    System.out.println();
                    for (int i = 0; i < notas.length; i++) {
                        System.out.println((i+1)+". Estudiante: "+ Estudiantes[i]+" Nota: "+notas[i]);
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    double promedio=0;
                    double sumatoria=0;
                    for (int i = 0; i < notas.length; i++) {
                        sumatoria+=notas[i];
                    }
                    promedio=sumatoria/cantidadEstudiantes;
                    System.out.println("El promedio del curso es: "+promedio);
                    break;
                case 4:
                    double notaAlta=0, notaBaja=0, aux=0;
                    double[] notasOrdenadas = new double[cantidadEstudiantes];
                    for (int i = 0; i < notasOrdenadas.length; i++) {
                        notasOrdenadas[i]= notas[i];
                    }
                    for (int i = 0; i < notasOrdenadas.length-1; i++) {
                        for (int j = 0; j < notasOrdenadas.length-1-i; j++) {
                            if (notasOrdenadas[j]>notasOrdenadas[j+1]) {
                                aux=notasOrdenadas[j];
                                notasOrdenadas[j]=notasOrdenadas[j+1];
                                notasOrdenadas[j+1]=aux;
                            }
                        }
                    }
                    
                    System.out.println();
                    notaAlta=notasOrdenadas[notasOrdenadas.length-1];
                    notaBaja=notasOrdenadas[0];
                    System.out.println("La nota mas alta fue: "+notaAlta);
                    System.out.println("La nota mas baja fue: "+notaBaja);

                    break;

                case 5:
                    int indice;
                    do {
                        System.out.println("Ingrese el indice a buscar (entre 0 y "+(cantidadEstudiantes-1)+"): ");
                         indice= sc.nextInt();
                        if (indice<0 || indice>cantidadEstudiantes-1) {
                            System.out.println("Valor fuera de rango");
                            
                        }
                        else{
                        System.out.println("Estudiante:"+Estudiantes[indice]);
                        System.out.println("Nota: "+notas[indice]);
                        }
                    } while (indice<0 ||indice>cantidadEstudiantes-1);
                    break;
                case 0:
                    System.out.print("Esta seguro? S/N: ");
                    opcionContinuar= sc.next().charAt(0);
                    break;
                default:
                    break;
            }
        } while (opcion!=0 ||(opcionContinuar !='S' && opcionContinuar !='s'));
        sc.close();
    }
}
