package Arreglos;

import java.util.Random;
import java.util.Scanner;

public class BusquedaLineal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int numero[]=new int[10];
        int posiciones[] = new int[10];
        int tope=-1, numeroBuscar;


        for(int i=0;i<10;i++){
            numero[i]= ra.nextInt(10)+1;
        }
        System.out.print("Ingrese numero a buscar: ");
        numeroBuscar= sc.nextInt();
        sc.nextLine();

        for(int i=0;i<10;i++){
            if(numero[i]==numeroBuscar){
                tope++;
                posiciones[tope]=i;
            }
        }

        System.out.print("Arreglo original:");
        for (int i : numero) {
            System.out.print(" "+i);
        }
        System.out.println("\nNumero buscado: "+numeroBuscar);
        System.out.print("Posiciones:");
        for(int i=0;i<=tope;i++){
            System.out.print(" "+posiciones[i]);
        }
        

        sc.close();
    }   
}
