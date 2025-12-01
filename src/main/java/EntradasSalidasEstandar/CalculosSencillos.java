package EntradasSalidasEstandar;

import java.util.Scanner;

public class CalculosSencillos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int largo, ancho;

        System.out.print("ingrese el largo del rectangulo: ");
        largo=consola.nextInt();
        consola.nextLine();

        System.out.print("ingrese el ancho del rectangulo: ");
        ancho=consola.nextInt();
        consola.nextLine();

        int perimetro;
        perimetro = ((2*ancho)+(2*largo));

        int area;
        area=ancho*largo;

        System.out.println("el perimetro del rectangulo es "+perimetro+" y el area es "+area);
        consola.close();
    }

}
