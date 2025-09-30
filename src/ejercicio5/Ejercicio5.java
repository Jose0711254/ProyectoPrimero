package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        System.out.println("Aplicación Iniciada");
        System.out.println("Introduce un precio");
        Scanner sc = new Scanner(System.in);

        double precio = sc.nextDouble();

        if(precio>=100){
            double precioRebajado = precio - precio*0.15;
            System.out.println(precioRebajado);
        }else {
            System.out.println("El precio es de: " + precio);
        }
        System.out.println("FIN");
    }
}
