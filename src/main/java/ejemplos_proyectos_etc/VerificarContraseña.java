package ejemplos_proyectos_etc;

import java.util.Scanner;

public class VerificarContraseña {
    public static void main(String[] args) {
        String contraseña;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        contraseña = sc.nextLine();

        if (contraseña.equals("java123")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        sc.close();
    }
}
