package reto1;

import java.util.Scanner;

public class Reto1 {
    //Métodos o Funciones
    public static void rascacielos(int value) {
        int ladrillo =  value;
        int cemento = ladrillo * 2;
        cemento = cemento + 4;
        int bloque = ladrillo + cemento;
        bloque = bloque / 5;
        System.out.println(ladrillo+" "+cemento+" "+bloque);
        
        String fase = "";
        if (bloque >= 0 && bloque <= 20) {
            //System.out.println("uno");
            fase = "uno";
        } else if (bloque >= 21 && bloque <= 30) {
            //System.out.println("dos");
            fase = "dos";
        } else if (bloque >= 31 && bloque <= 50) {
            //System.out.println("tres");
            fase = "tres";
        } else {
            //System.out.println("cuatro");
            fase = "cuatro";
        }
        System.out.println(fase);
        
    }
    //Main
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int pisos = consola.nextInt();
        rascacielos(pisos);
        
    }

}
