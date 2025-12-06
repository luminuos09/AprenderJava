package ejemplos_proyectos_etc;

import java.util.Random;
import java.util.Scanner;

public class AdivinadorBasico2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto= random.nextInt(100)+1;
        int valorleido;
        boolean adivino =false;
        for(int intento=1;intento<=10;intento++){
            System.out.print("intento: "+intento+". Ingrese un valor: ");
            valorleido= sc.nextInt();

                if(valorleido==numeroSecreto){
                    System.out.println("adivinaste");
                    adivino=true;

                    break;
                }
        }
        if(!adivino){
            System.out.println("no adivinaste");
        }


        sc.close();           

    }
}
