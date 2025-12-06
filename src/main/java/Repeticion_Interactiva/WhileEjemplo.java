package Repeticion_Interactiva;

import java.util.Scanner;

public class WhileEjemplo {
    public static void main(String[] args) {
        int numero;
        Scanner sc =new Scanner(System.in);
        System.out.print("ingresa un numero: ");
        numero= sc.nextInt();
        int i=1;
        int suma1=0;
        while ( i<=numero) {
            suma1=i+suma1;
            i++;          
        }
        System.out.println("la suma es : "+ suma1);
       

        sc.close();
    }
}
