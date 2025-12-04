package EntradasSalidasEstandar;

import java.util.Scanner;

public class Inferencias {
    public static void main(String[] args) {
        //mediante la funcion "var" declaramos una variable y al darle un valor, por defecto java detecta que tipo de variable es, nota: es obligatorio darle un valor a la variable
        var sc = new Scanner(System.in);

        var nombre = sc.nextLine();
        System.out.println("tu nombre inferido es: "+nombre);
        sc.close();
    }
}
