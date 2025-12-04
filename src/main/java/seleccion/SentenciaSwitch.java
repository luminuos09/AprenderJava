package seleccion;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String opcion;
        System.out.println("1. Rectangulo\n 2. Circunfernecia \n 3.Salir ");
        System.out.print("Elige una opcion: ");
        opcion= sc.nextLine();

        switch (opcion) {
            case "1":
                System.out.println("rectangulo");
                break;
            case "2":
                System.out.println("circunferencia");
                break;
                
            case "3":
            System.out.println("saliendo del sistema");
                break;    
        
            default:
                System.out.println("error");
                break;
        }
    sc.close();
    }
}
