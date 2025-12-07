package ejemplos_proyectos_etc;

import java.util.Scanner;
// aunque no lo parezca este ejercicio me hizo dar un dolor de cabeza mientras lo hacia y eso que es nivel basico
public class SistemaBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("Bienvenido al Sistema básico de registro y validación");
        System.out.print("Ingrese su nombre: ");
        var usuario = sc.nextLine();
        System.out.println("bienvenido de vuelta "+ usuario);

        do{
        System.out.println("1. Registrar un nombre válido");
        System.out.println("2. Registrar una edad válida");
        System.out.println("3. Repetir un mensaje N veces");
        System.out.println("4. Adivinar un número secreto");
        System.out.println("0. Salir ");

        System.out.print("Escoja una opcion: ");
        opcion=sc.nextInt();
        sc.nextLine();
            switch(opcion) {
                case 1:
                    boolean indicador = false;
                    while(indicador==false){
                    System.out.print("Ingrese su nombre: ");
                    var nombre = sc.nextLine();
                    if(nombre.isEmpty()){
                        System.out.println("ingrese un nombre valido");
                    }else{
                        indicador=true;
                        System.out.println("Bienvenido "+nombre);
                        System.out.println("Nombre registrado correctamente");
                    }
                    }
                    break;

                case 2:
                    int edad;
                    do {
                    System.out.print("Ingrese una edad entre 1 y 120");
                    edad = sc.nextInt();
                    if(edad<0 || edad>121){
                        System.out.println("Edad invalida, ingrese un valor valido");
                    }
                    } while (edad<0 || edad>121);
                    System.out.println("Edad registrada");
                    break;
                    
                case 3:
                    String mensaje;
                    int numero;

                    System.out.print("Ingresa un mensaje: ");
                    mensaje=sc.nextLine();

                    do {
                    System.out.print("Cuantas veces quiere que se repita: ");
                    numero= sc.nextInt();
                    if(numero<0){
                        System.out.println("el numero debe ser mayor a 0");
                    }
                    if(numero>100){
                        System.out.println("mucho spam, debe ser un numero mas pequeño");
                    }
                    } while (numero<0 || numero>100);
                    
                    for(int i=0; i<numero;i++){
                        System.out.println(mensaje);
                    }
                    break;
                    
                case 4:
                    System.out.println("ADIVINAR NUMERO SECRETO");
                    int numeroSecreto = 12;
                    int intento=0;

                    while(intento != numeroSecreto){
                        System.out.print("Ingrese el numero que crea que es: ");
                        intento= sc.nextInt();
                        if(intento == numeroSecreto){
                            System.out.println("Correcto, ese era el numero");
                        }
                        else{
                            System.out.println("Numero incorrecto, intenta de nuevo");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa, vuelva pronto");
                break;

                default:
                    System.out.println("Error, pulse de nuevo");
            }

        } while (opcion != 0); 
        sc.close();

    }
}
