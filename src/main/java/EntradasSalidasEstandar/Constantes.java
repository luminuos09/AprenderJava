package EntradasSalidasEstandar;

import java.util.Scanner;

public class Constantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        double perimetro, area;
        final double PI=3.1415;

        System.out.print("Ingrese el radio: ");
        radio = sc.nextDouble();

        perimetro = (radio*2)*PI;
        area = (radio*radio)*PI;

        System.out.println("El perimetro es: "+perimetro);
        System.out.println("El area es: "+area);
        sc.close();




    }
}
