package ejemplos_proyectos_etc;

import java.util.Scanner;

public class UsuarioNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String usuario;
        System.out.print("Ingrese su nombre: ");
        usuario = sc.nextLine();

        System.out.println("Buenas señor "+usuario);
        System.out.print("Ingrese el primer numero: ");
        num1 =sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        sc.nextLine();

        if(num1==num2){

            System.out.println("los numeros son iguales");
        }
        else if(num1>num2) {
            System.out.println("el primer numero es mayor que el segundo");
        }
        else{
            System.out.println("el segundo numero es mayor que el primero");
        }

    sc.close();

    }
}
