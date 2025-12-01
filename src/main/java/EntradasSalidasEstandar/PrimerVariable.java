package EntradasSalidasEstandar;

import java.util.Scanner;

public class PrimerVariable {
    //creamos la clase principal
    public static void main(String[] args) {
        //declaramos la variable fuera de la clase principal, no importa si este esta fuera o dentro
        String nombre;
        //mediante la funcion scanner leeremos las variables, para eso hay que instanciarlas con el nombre de "entrada"
        Scanner sc = new Scanner(System.in);
        //con la funcion sout pedimos que escriba su nombre
        System.out.print("Escriba su nombre: ");
        //llamamos al scanner con el nombre que le dimos, es decir "sc", y luego con nextline() lo leemos como un string y lo guardamos en la variable creada anteriormente
        nombre= sc.nextLine();
        //ahora escribimos un saludo y concatenamos con la variable 
        System.out.println("hola "+nombre+" es un placer");
        //cerramos la instanciacion del scanner
        sc.close();
    }
}
