package Arreglos;

import java.util.Scanner;

public class arreglo2 {
    public static void main(String[] args) {
        //llenar el arrelglo
        int nElementos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la cantidad de elementos del arreglo: ");
        nElementos= sc.nextInt();

        char[] letras = new char[nElementos];
        System.out.println("Digite los elementos del arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Digite un caracter: ");
            letras[i]=sc.next().charAt(0);
        }

        //mostrar el arreglo
        System.out.println("Los caracteres de los arreglos son: ");
        for (int i = 0; i < nElementos; i++) {
                System.out.print(letras[i]);      
        }

        //condicionar arreglo
        System.out.println("\n");
        char condicion;
        System.out.print("Que letra desea buscar en el arreglo: ");
        condicion= sc.next().charAt(0);
        int contador=0;
        for (int i = 0; i < nElementos; i++) {
            
            if (letras[i]==condicion) {
                contador++;
                System.out.println(letras[i]);
            }
        }
        System.out.println("en el arreglo, la letra "+condicion+" se encuentra "+contador+" veces");
        sc.close();
    }
}
