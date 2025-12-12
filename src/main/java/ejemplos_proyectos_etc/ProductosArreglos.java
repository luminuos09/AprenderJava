package ejemplos_proyectos_etc;

import java.util.Scanner;

public class ProductosArreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        char opcionContinuar = 'S';

        String[] nombres = new String[20];
        int[] cantidades = new int[20];
        double[] precios = new double[20];

        int contador = 0;

        System.out.println("Bienvenido al sistema de gestion de productos");

        do {

            System.out.println("\n---- MENÚ ----");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar todos los productos");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Actualizar cantidad de un producto");
            System.out.println("5. Calcular valor total del inventario");
            System.out.println("0. Salir");
            System.out.print("Que desea hacer: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    if (contador == 20) {
                        System.out.println("No se pueden registrar más productos (límite alcanzado).");
                        break;
                    }

                    // Registrar nombre
                    String nombre;
                    do {
                        System.out.print("Ingrese el nombre del producto: ");
                        nombre = sc.nextLine().trim();
                        if (nombre.isEmpty()) {
                            System.out.println("El nombre no puede estar vacío.");
                        }
                    } while (nombre.isEmpty());
                    nombres[contador] = nombre;

                    // Registrar cantidad
                    int cantidad;
                    do {
                        System.out.print("Ingrese la cantidad: ");
                        cantidad = sc.nextInt();
                        if (cantidad < 0) {
                            System.out.println("La cantidad no puede ser negativa.");
                        }
                    } while (cantidad < 0);
                    cantidades[contador] = cantidad;

                    // Registrar precio
                    double precio;
                    do {
                        System.out.print("Ingrese el precio: ");
                        precio = sc.nextDouble();
                        if (precio < 0) {
                            System.out.println("El precio no puede ser negativo.");
                        }
                    } while (precio < 0);
                    precios[contador] = precio;

                    contador++; // MUY IMPORTANTE
                    System.out.println("Producto registrado correctamente.");
                    break;

                case 2:
                    if (contador == 0) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.println("\n--- LISTA DE PRODUCTOS ---");
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + ". " + nombres[i] +
                                    " | Cant: " + cantidades[i] +
                                    " | Precio: $" + precios[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String buscar = sc.nextLine().trim().toLowerCase();

                    boolean encontrado = false;
                    for (int i = 0; i < contador; i++) {
                        if (nombres[i].toLowerCase().equals(buscar)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Nombre: " + nombres[i]);
                            System.out.println("Cantidad: " + cantidades[i]);
                            System.out.println("Precio: $" + precios[i]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No existe ese producto.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    String actualizar = sc.nextLine().trim().toLowerCase();

                    boolean modificado = false;
                    for (int i = 0; i < contador; i++) {
                        if (nombres[i].toLowerCase().equals(actualizar)) {
                            int nuevaCantidad;
                            do {
                                System.out.print("Nueva cantidad: ");
                                nuevaCantidad = sc.nextInt();
                                if (nuevaCantidad < 0) {
                                    System.out.println("No puede ser negativa.");
                                }
                            } while (nuevaCantidad < 0);

                            cantidades[i] = nuevaCantidad;
                            System.out.println("Cantidad actualizada.");
                            modificado = true;
                            break;
                        }
                    }

                    if (!modificado) {
                        System.out.println("Ese producto no existe.");
                    }
                    break;

                case 5:
                    double total = 0;
                    for (int i = 0; i < contador; i++) {
                        total += cantidades[i] * precios[i];
                    }
                    System.out.println("Valor total del inventario: $" + total);
                    break;

                case 0:
                    System.out.print("Está seguro? S/N: ");
                    opcionContinuar = sc.next().charAt(0);
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (!(opcion == 0 && (opcionContinuar == 'S' || opcionContinuar == 's')));


        sc.close();
    }
}
