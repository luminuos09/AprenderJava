package Arreglos;

import java.util.Scanner;

public class ArreglosCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int Cantida_Caracteres=10;
        char[] simbolos = new char[Cantida_Caracteres];
        int contador=0;
       
        String frase, letra;
        System.out.print("Ingresa la frase: ");
        frase = sc.nextLine();
        System.out.print("Ingresa un caracter: ");
        letra = sc.nextLine();

        char letrachar= letra.charAt(0);
        simbolos =frase.toCharArray();
        

        for (int i=0;i<simbolos.length;i++) {
            if (simbolos[i]==letrachar) {
                contador++; 
            }
        }
        System.out.println("El caracter '"+letrachar+"' aparece "+contador+" veces");
        sc.close();
    }
}
