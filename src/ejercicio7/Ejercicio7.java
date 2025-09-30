package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        System.out.println("Bienvenido");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una nota decimal entre 0 y 10");
        double nota = sc.nextDouble();
        if(!(nota>=0 && nota<=10)){
            System.out.println("La nota debe estar entre 0 e 10");
        }else{
            if(nota<5){
                System.out.println("Estás suspenso");
            } else if (nota<6) {
                System.out.println("Estás aprobado");
            } else if (nota<7) {
                System.out.printf("Tienes un bien");
            } else if (nota<9) {
                System.out.println("Tienes un notable");
            } else if (nota>9) {
                System.out.println("Tienes un sobresaliente");
            }
        }

    }
}
