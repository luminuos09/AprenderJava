package ejemplos_proyectos_etc;

import java.util.Random;
import java.util.Scanner;

public class AdivinadorBasico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); //instanciamos la libreria random 

        int numeroSecreto= random.nextInt(1000)+1;//mediante la funcion, escoge un numero del 1 al 1000 y lo guarda en la variable
        int valorleido;
        boolean adivino=false;
        System.out.println("Rango de valores: 1 a 1000 inclusive ");
        System.out.println(numeroSecreto);

        for(int intento=1;intento<=10;intento++){
            System.out.print("intento: "+intento+". Ingrese un valor: ");
            valorleido=sc.nextInt();

            if(valorleido>numeroSecreto ){
                System.out.println("el numero a adivinar es menor");
            }else{
                System.out.println("el numero a adivinar es mayor");
            }

            if(valorleido==numeroSecreto){
                System.out.println("adivinaste");
                adivino=true;
                break;
            }
        }

        if(!adivino){
            System.out.println("Has perdido, el numero era: "+numeroSecreto);
        }
        sc.close();
    }
}
