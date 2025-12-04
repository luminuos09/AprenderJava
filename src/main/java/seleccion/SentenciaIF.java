package seleccion;

import java.util.Scanner;

public class SentenciaIF {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int edad;
    System.out.print("Edad: ");
    edad=sc.nextInt();

    if (edad<=40) {
        System.out.println("eres joven");

    }
    else{
        System.out.println("eres viejo");
    }
    sc.close();


}



}

