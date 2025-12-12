package ejemplos_proyectos_etc;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosDesordenados = new int[5];
        int aux;
        for (int i = 0; i < 5; i++) {
          System.out.print("Ingresa 5 numeros para ordenar: ");
          numerosDesordenados[i]=sc.nextInt();
        }
        for (int i = 0; i < numerosDesordenados.length-1; i++) {
            for (int j = 0; j < numerosDesordenados.length-1-i; j++) {
                if (numerosDesordenados[j]>numerosDesordenados[j+1]) {
                    aux = numerosDesordenados[j];
                    numerosDesordenados[j]=numerosDesordenados[j+1];
                    numerosDesordenados[j+1]=aux;
                }
            }
        }


        System.out.println("Los numeros ordenados: ");
        for (int i : numerosDesordenados) {
            System.out.println(i+"");
        }
    
        sc.close();
    }


    


}
