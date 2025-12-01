package EntradasSalidasEstandar;

import java.util.Scanner;

public class LeyendoEnteros {
    //creamos la clase principal
    public static void main(String[] args) {
        //declaramos las variables que usaremos en esta clase, una tipo caracter(string)  y otra tipo entero(int)
        String nombrePersona;
        int edadPersona;
        //instaciamos el scanner como en el ejercicio anterior(PrimerVariable.java)
        Scanner sc =new Scanner(System.in);
        //le pedimos al usurio que ingrese su nombre con la funcion sout, y luego la leemos con el scanner y la guardamos en la variable tipo caracter
        System.out.print("Ingresa tu nombre: ");
        nombrePersona=sc.nextLine();
        //le pedimos al usurio que ingrese su edad con la funcion sout, y luego la leemos con el scanner y la guardamos en la variable tipo entero, aqui la guardamos con una extension nextInt() que hace referencia a los enteros
        System.out.print("\nIngresa tu edad: ");
        edadPersona=sc.nextInt();

        //luego le mostramos el resultado concatenando todo
        System.out.println("tu nombre es "+nombrePersona+" y tienes "+edadPersona+" años");
        //cerramos el scanner
        sc.close();
    }
}
