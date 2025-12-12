package Arreglos;
import java.util.Arrays;
public class arreglos {
    public static void main(String[] args) {
        int arreglo[] =new int[10];
        int arr2[] = new int[10];
        int i=0, valor=1;
        for(i=0;i<10;i++){
            arreglo[i]=valor;
            arr2[i]=valor;
            valor++;
        }

        if(Arrays.equals(arreglo, arr2)){
            System.out.println("son iguales");
        }
        else{
            System.out.println("son distintos");
        }

        for(i=0;i<10;i++){
            System.out.print(arreglo[i]+" ");
        }

    }
}
