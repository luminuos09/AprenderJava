package ejemplos_proyectos_etc;

import java.util.Scanner;

//si ves esto, esta cule jodon el ejercicio

public class SistemaGestionSillas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sillas = {"L","L","L","L","L","L","L","L","L","L"};
        int opcion=0;
        char opcionContinuar='S';

        do {
            
            System.out.println("1. Estado de las sillas");
            System.out.println("2. Reservar una silla");
            System.out.println("3. Liberar una silla");
            System.out.println("4. Mostrar cantidad de sillas disponibles y ocupadas");
            System.out.println("0. Salir");
            System.out.print("Que desea hacer: ");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < sillas.length; i++) {
                        System.out.println("Silla #"+(i+1)+": "+sillas[i]);
                    }
                    break;
                case 2:
                    boolean condicion=false;
                    int numero=0;
                    do {
                        System.out.println("Ingrese el numero de la silla que quiere reservar(1-10): ");
                        numero=sc.nextInt();
                        if (numero>0) {
                            numero -=1;
                        }
                        if (numero<0 || numero>=sillas.length) {
                            System.out.println("Ingrese otro valor");
                            condicion=false;
                        }else{
                            if (sillas[numero].equals("L")) {
                            System.out.println("Su silla ha sido reservada");
                            sillas[numero]="O";
                            condicion=true;
                            }else{
                                System.out.println("La Silla ya se encuentra ocupada, elija otra");
                                condicion= false;
                            }
                        }
                        
                    } while (!condicion);
                    
                    
                    

                    break;
                case 3:
                    boolean condition=false;
                    int liberar;
                    
                    do {
                        System.out.println("Ingrese el numero de la  silla a liberar(1-10): ");
                        liberar=sc.nextInt();
                        if (liberar>0) {
                            liberar -=1;
                        }
                        if (liberar<0 || liberar>sillas.length) {
                            System.out.println("Ingrese otro valor");
                            condition=false;
                        }
                        else{
                            if(sillas[liberar].equals("O")){
                                System.out.println("La silla ha sido liberada");
                                sillas[liberar]="L";
                                condition=true;
                            }else{
                                System.out.println("La silla ya se encuentra libre");
                                condition=false;
                            }
                        }
                    

                    }while (!condition);
                    break;
                case 4:
                    int contLibres=0, contOcupadas=0;
                    for (int i = 0; i < sillas.length; i++) {
                        if (sillas[i]=="L") {
                            contLibres++;
                        }else{
                            contOcupadas++;
                        }
                    }
                    System.out.println("Sillas libres: "+contLibres);
                    System.out.println("Sillas ocupadas: "+contOcupadas);
                    break;
                case 0:
                    System.out.print("Esta seguro (S/N): ");
                    opcionContinuar=sc.next().charAt(0);
                    break;
                default:
                    System.out.println("Error, ingrese un valor disponible");
                    break;
            }
        } while (opcion  !=0 ||(opcionContinuar!='S' && opcionContinuar!='s'));
        System.out.println("Saliendo del programa, vuelva pronto");
        sc.close();
    }
}
