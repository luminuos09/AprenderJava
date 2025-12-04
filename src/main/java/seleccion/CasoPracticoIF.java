package seleccion;

import java.util.Scanner;

public class CasoPracticoIF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String opcion;
        System.out.println("1. Rectangulo\n 2. Circunfernecia ");
        System.out.print("Elige una opcion: ");
        opcion= sc.nextLine();

        if (opcion.equals("1")) {
            System.out.println("rectangulo");
        }else if (opcion.equals("2")) {
            System.out.println("circunferencia");
        }else{
            System.out.println("error ingrese otro numero");
        }

sc.close();
    }
}
