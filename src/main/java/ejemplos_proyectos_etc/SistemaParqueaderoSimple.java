package ejemplos_proyectos_etc;

import java.util.Scanner;

public class SistemaParqueaderoSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        char opcionContinuar='S';
        String placaVehiculo="";
        boolean estado=false;

        do {
            System.out.println("1. Registrar entrada de vehiculo");
            System.out.println("2. Registrar salida de vehiculo");
            System.out.println("3. Mostrar estado de parqueadero");
            System.out.println("0. Salir");
            System.out.print("Que desea escojer: ");
            opcion =sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if(placaVehiculo.isEmpty()){
                        System.out.print("Escriba la placa del vehiculo a parquear: ");
                        placaVehiculo = sc.nextLine().toUpperCase();
                        estado=true;
                    }else{
                        System.out.println("Ya hay un vehiculo adentro, Por favor espere");
                    }
                    break;

                case 2:
                    String retirar;
                    System.out.println("Ingresa la plca del vehiculo a retirar: ");
                    retirar = sc.nextLine().toUpperCase();
                    if(retirar.equals(placaVehiculo)){
                        placaVehiculo="";
                        System.out.println("vehiculo retirado");
                        estado=false;
                    }else{
                        System.out.println("No hay ningun vehiculo a retirar");
                        
                    }
                    break;
                case 3:
                    if(!estado){
                        System.out.println("No hay ningun vehiculo a retirar");
                    }else{
                        System.out.println("Estado: Ocupado - Placa: "+placaVehiculo);
                    }
                    break;


                case 0:
                    System.out.print("Esta seguro? S/N: ");
                    opcionContinuar= sc.next().charAt(0);
                    break;
            
                default:
                    System.out.println("Error");
                    break;
            }
        } while (opcion !=0 ||(opcionContinuar =='N' || opcionContinuar =='n'));
        sc.close();
    }
}
