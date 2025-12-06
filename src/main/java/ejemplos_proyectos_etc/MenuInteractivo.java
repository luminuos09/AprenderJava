package ejemplos_proyectos_etc;

import java.util.Scanner;

public class MenuInteractivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario;
        int opcion;
        int numero;

        System.out.print("Por favor, ingrese su nombre: ");
        usuario = sc.nextLine();
        System.out.println("Bienvenido " + usuario);

        do {
            // MENÚ
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Saludar al usuario N veces");
            System.out.println("2. Verificar si un número es positivo, negativo o cero");
            System.out.println("3. Mostrar números del 1 al X");
            System.out.println("4. Pedir una contraseña hasta que sea correcta");
            System.out.println("0. Salir");
            System.out.print("Escoja una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    numero = sc.nextInt();
                    sc.nextLine();

                    for (int i = 1; i <= numero; i++) {
                        System.out.println("Hola " + usuario + ", este es el saludo #" + i);
                    }
                    break;

                case 2:
                    System.out.print("Ingrese un número: ");
                    numero = sc.nextInt();
                    sc.nextLine();

                    if (numero == 0) {
                        System.out.println("El número es 0");
                    } else if (numero > 0) {
                        System.out.println("El número es positivo");
                    } else {
                        System.out.println("El número es negativo");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese un número: ");
                    numero = sc.nextInt();
                    sc.nextLine();

                    int i = 1;
                    while (i <= numero) {
                        System.out.println(i);
                        i++;
                    }
                    break;

                case 4:
                    String contrasena;
                    do {
                        System.out.print("Ingrese su contraseña: ");
                        contrasena = sc.nextLine();

                        if (!contrasena.equals("java123")) {
                            System.out.println("Contraseña incorrecta");
                        }

                    } while (!contrasena.equals("java123"));

                    System.out.println("Acceso concedido");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
