package ejemplos_proyectos_etc;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, contraseña="";
        int opcion=0;
        double saldo=0;
        char opcionContinuar= 'S';
        double totalDepositado=0, totalRetirado=0;
        int transacciones=0;

        System.out.println("Bienvenido al cajero automatico");
        System.out.print("Ingrese su usuario: ");
        usuario= sc.nextLine();
        
        do {
            System.out.print("Ingrese contraseña: ");
            contraseña = sc.nextLine();
            if (!contraseña.equals("1234")) {
                System.out.println("Contraseña incorrecta");
            }    
        } while (!contraseña.equals("1234"));

        System.out.println("Bienvenido de vuelta "+usuario);

        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Mostrar Historial Basico");
            System.out.println("0. Salir");

            System.out.print("Escoja una opcion: ");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es: "+saldo);
                    break;
                case 2:
                    double deposito;
                    boolean condicion=false;
                    while (!condicion) {
                    System.out.print("Cuanto desea depositar: ");
                    deposito= sc.nextDouble();
                    
                    if (deposito<0){
                        System.out.println("Ingrese un valor mayor a 0");
                    }
                    else{
                        totalDepositado +=deposito;
                        condicion=true;
                        saldo+= deposito;
                        transacciones++;
                        System.out.println("Deposito Hecho");
                    }
                    }
                    
                    break;


                case 3:
                    double retirar;
                    boolean validar= false;
                    while(!validar){
                    System.out.print("Cuanto desea retirar: ");
                    retirar=sc.nextDouble();
                    if(retirar>saldo){
                        System.out.println("Saldo insuficiente para retirar");
                    }else{
                        saldo -= retirar;
                        totalRetirado += retirar;
                        validar=true;
                        transacciones++;
                        System.out.println("Retiro exitoso");
                        
                    }
                    }
                    
                    break;

                case 4: 
                    System.out.println("Total retirado: "+totalRetirado);
                    System.out.println("Total Depositado: "+totalDepositado);
                    System.out.println("Total de Transacciones: "+transacciones);
                break;


                case 0:
                    
                    System.out.print("Esta seguro? S/N: " );
                    opcionContinuar = sc.next().charAt(0);
                    break;
                    
                default:
                    System.out.println("opcion no existente, intente de nuevo");
                    break;
            }


        } while (opcion !=0 && (opcionContinuar !='s' || opcionContinuar !='S'));
        sc.close();
    }
}
