package ejemplos_proyectos_etc;

import java.util.Scanner;
import java.util.Random;

public class AdivinadorBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100)+1;
        int valorleido;

        System.out.println("ingrese un valor: ");
        valorleido=sc.nextInt();

        if(valorleido==numeroSecreto){
            System.out.println("adivinaste");
        }else{
            System.out.println("no adivinaste");
        }

sc.close();
    }

}
