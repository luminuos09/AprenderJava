package Arreglos;

public class Arg_ForEach {
    public static void main(String args[]) {
        System.out.println("Cantidad de argumentos: "+args.length);
        System.out.println("Lista de argumentos");

        for (String arg : args) {
            System.out.println(arg+" ");
        }

        int miarreglo[]= {10,9,7,8,5};
        for (int i : miarreglo) {
            System.out.print(i+" ");
        }
    }
}
