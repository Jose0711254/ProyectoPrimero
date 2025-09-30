package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        System.out.println("Programa iniciado");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombreUsuario = sc.nextLine();
        if(nombreUsuario.equals("admin")){
            System.out.println("Bienvenido administrador!!!");
        }else{
            System.out.println("USUARIO NO VÁLIDO");
        }
        System.out.println("FIN");
    }
}
