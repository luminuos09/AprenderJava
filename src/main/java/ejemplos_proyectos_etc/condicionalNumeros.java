package ejemplos_proyectos_etc;

import java.util.Scanner;

public class condicionalNumeros {
    public static void main(String[] args) {
        int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero : ");
        numero = lector.nextInt();

        if (numero==0) {
            System.out.println("el numero es 0");
        }
        else{
            if (numero>0) {
                System.out.println("el numero el positivo");
            }
            else{
                System.out.println("el numero es negativo");
            }
        }
      lector.close();

    }
}
