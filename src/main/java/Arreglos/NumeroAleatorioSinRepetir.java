package Arreglos;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorioSinRepetir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int numero, k, j;
        int[] arregloSinRepetir = new int[10];
        int contador=0;

        
        for ( k = 0; k < 10; k++) {
            numero = ra.nextInt(10);
            j=0;
            while (j<k) {
                
                contador++;
                if(arregloSinRepetir[j]==numero){
                    j=0;
                    numero=ra.nextInt(10);
                }else{
                    j++;
                }
            }

            arregloSinRepetir[k]=numero;
        
        }

        for (int  x : arregloSinRepetir) {
            System.out.print(x +" ");
        }
        System.out.println("\nContador: "+contador);
        sc.close();
    }
}
