package ejemplos_proyectos_etc;

import java.util.Scanner;

public class UsuarioCicloFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingrese un valor: ");
        int valor = sc.nextInt();

        if (valor <= 0) {
            System.out.println("El valor debe ser mayor que 0");
        } else {
            for (int i = 1; i <= valor; i++) {
                System.out.println("Hola " + usuario + ", este es el mensaje número " + i);
            }
        }

        sc.close();
    }
}
